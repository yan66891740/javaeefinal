package com.iotek.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@RequestMapping("user")
@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping("checkName")
	public String checkName(Model model, String username) {
		User user = uservice.queryUserByUsername(username);
		if(user != null) {
			return "";
		}
		return "";
	}
	
	public String addUser(Model model) {
		return "";
	}

}
