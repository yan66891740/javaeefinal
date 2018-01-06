package com.iotek.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.service.DepartmentService;

@RequestMapping("department")
@Controller("departmentController")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	

}
