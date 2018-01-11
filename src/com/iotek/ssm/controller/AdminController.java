package com.iotek.ssm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.DepartmentService;
import com.iotek.ssm.service.InterviewService;
import com.iotek.ssm.service.PositionService;
import com.iotek.ssm.service.ResumeService;

@RequestMapping("adminc")
@Controller("adminController")
public class AdminController {
	
	@Autowired
	private InterviewService interviewService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	
	@RequestMapping("showInters")
	public String showInters(Model model) {
		List<Interview> inters = interviewService.queryAll();
		model.addAttribute("inters", inters);
		return "admin/admin";
	}
	
	@RequestMapping("queryResume")
	public String queryResume(Model model, Integer id) {
		Resume resume = resumeService.queryByUid(id);
		model.addAttribute("resume", resume);
		return "admin/admin";
	}
	
	public String setForInter(Integer id, Date forInter) {
		Interview inter = interviewService.queryById(id);
		inter.setCheck("�Ѳ鿴");
		inter.setForInter(forInter);
		interviewService.updateInterview(inter);
		return "redirect:adminc/showInters";
	}
	
	@RequestMapping("checkInter")
	public String checkInter(Model model, Integer id) {
		Interview inter = interviewService.queryById(id);
		inter.setCheck("�Ѳ鿴");
		int res = interviewService.updateInterview(inter);
		if(res > 0) {
			System.out.println("�޸ĳɹ�");
		}
		return "redirect:adminc/showInters";
	}
	
	@RequestMapping("delInterview")
	public String delInterview(Model model, Integer id ) {
		int res = interviewService.delInterview(id);
		if(res > 0) {
			System.out.println("ɾ���ɹ�");
		}
		return "redirect:adminc/showInters";
	}
	
	@RequestMapping("alldepts")
	public String alldepts(Model model) {
		List<Department> depts = departmentService.queryAll();
		model.addAttribute("depts", depts);
		return "admin/deptpost";
	}
	
	@RequestMapping(value = "queryPost",method=RequestMethod.POST)
	@ResponseBody
	public String queryPost(Model model, Integer id) {
		List<Position> posts = positionService.queryByDid(id);
		
		return "";
	}
	
	@RequestMapping(value = "checkDeptName",method=RequestMethod.POST)
	@ResponseBody
	public String checkDeptName(Model model, String name) {
		Department dept = departmentService.queryByName(name);
		if(dept != null) {
			return "error";
		}else {
			return "success";
		}
	}

}
