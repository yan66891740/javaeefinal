package com.iotek.ssm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.DepartmentService;
import com.iotek.ssm.service.InterviewService;
import com.iotek.ssm.service.PositionService;
import com.iotek.ssm.service.ResumeService;

@RequestMapping("resume")
@Controller("resumeController")
public class ResumeController {
	
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private InterviewService interviewService;
	
	@RequestMapping("queryResume")
	public String queryResume(Model model, Integer id) {
		Resume resume = resumeService.queryByUid(id);
		List<Department> depts = departmentService.queryAll();
		if(resume != null) {
			List<Position> posts = positionService.queryByDid(resume.getDept().getdId());
			model.addAttribute("posts", posts);
		}
		model.addAttribute("resume", resume);
		model.addAttribute("depts", depts);
		return "tourist/resume";
	}
	
	@RequestMapping
	public String updateResume(HttpServletRequest req, HttpSession session) {
		int uId = ((User)session.getAttribute("user")).getuId();
		//查询简历是否存在
		Resume resume = resumeService.queryByUid(uId);
		//查询面试申请是否存在
		Interview interview = interviewService.queryById(uId);
		
		String rName = req.getParameter("rName");
		String gender = req.getParameter("gender");
		int age = Integer.valueOf(req.getParameter("age"));
		String edu = req.getParameter("edu");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		int dId = Integer.valueOf(req.getParameter("dept"));
		int pId = Integer.valueOf(req.getParameter("post"));
		String ps = req.getParameter("politicalStatus");
		String lastWork = req.getParameter("lastWork");
		Double workYears = Double.valueOf(req.getParameter("workYears"));
		String salary = req.getParameter("salary");
		String hobby = req.getParameter("hobby");
		
		if(resume == null) {
			resume = new Resume(0,rName,gender,age,edu,tel,email,new Department(dId, null, null),new Position(pId, null, null),
					ps,lastWork,workYears,salary,hobby,uId);
			resumeService.addResume(resume);
		}else {
			resume.setrName(rName);
			resume.setGender(gender);
			resume.setAge(age);
			resume.setEdu(edu);
			resume.setTel(tel);
			resume.setEmail(email);
			resume.setDept(new Department(dId, null, null));
			resume.setPost(new Position(pId, null, null));
			resume.setPoliticalStatus(ps);
			resume.setLastWork(lastWork);
			resume.setWorkYears(workYears);
			resume.setSalary(salary);
			resume.setHobby(hobby);
			resumeService.updateResume(resume);
		}
		
		if(interview == null || interview.getEmploy().equals("不录用")) {
			interview = new Interview(0,uId,rName,new Department(dId, null, null),new Date(),"未查看","未面试",null,"未录用");
			interviewService.addInterview(interview);
		}
		
		return "tourist/tourist";
	}

}
