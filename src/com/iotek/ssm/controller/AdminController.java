package com.iotek.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.InterviewService;
import com.iotek.ssm.service.ResumeService;

@RequestMapping("adminc")
@Controller("adminController")
public class AdminController {
	
	@Autowired
	private InterviewService interviewService;
	@Autowired
	private ResumeService resumeService;
	
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
	
	@RequestMapping("checkInter")
	public String checkInter(Model model, Integer id) {
		Interview inter = interviewService.queryById(id);
		inter.setCheck("已查看");
		int res = interviewService.updateInterview(inter);
		if(res > 0) {
			System.out.println("修改成功");
		}
		return "redirect:adminc/showInters";
	}
	
	@RequestMapping("delInterview")
	public String delInterview(Model model, Integer id ) {
		int res = interviewService.delInterview(id);
		if(res > 0) {
			System.out.println("删除成功");
		}
		return "redirect:adminc/showInters";
	}

}
