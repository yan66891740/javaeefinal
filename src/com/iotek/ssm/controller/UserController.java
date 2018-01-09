package com.iotek.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;
import com.iotek.ssm.util.App;

@RequestMapping("/user")
@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "checkName", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String checkName(Model model, String username) {
		User user = userService.queryUserByUsername(username);
		if(user != null) {
			return "error";
		}
		return "succsee";
	}
	
	@RequestMapping(value = "checkPassword", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String checkPassword(String password, HttpSession session) {
		User user = (User)session.getAttribute("user");
		if(App.md5(password).equals(user.getPassword())) {
			return "success";
		}
		return "error";
	}
	
	@RequestMapping("updateUser")
	public String updateUser(HttpSession session, HttpServletRequest req) {
		User user = (User)session.getAttribute("user");
		user.setPassword(App.md5(req.getParameter("newpassword")));
		int res = userService.update(user);
		if(res > 0) {
			session.setAttribute("user", user);
			req.setAttribute("msg", "修改成功！");
		}else {
			req.setAttribute("msg", "修改失败！");
		}
		return "tourist/tourist";
	}
	
	@RequestMapping("addUser")
	public String addUser(Model model, HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//type = 1：游客  2：员工  3：经理  0：管理员
		int res = userService.addUser(new User(0,username,App.md5(password),1));
		if(res > 0) {
			model.addAttribute("msg1","恭喜您，注册成功！");
			model.addAttribute("msg2","返回登录");
			model.addAttribute("address","index.jsp");
			return "tourist/wait";
		}else {
			model.addAttribute("msg", "注册失败！");
			return "redirect:index";
		}
	}
	
	@RequestMapping("login")
	public String login(HttpSession session, Model model, String username, String password) {
		User user = userService.queryUserByUsername(username);
		if(user != null && App.md5(password).equals(user.getPassword())) {
			model.addAttribute("msg1","恭喜您，登录成功！");
			model.addAttribute("msg2","进入个人界面");
			session.setAttribute("user", user);
			if(user.getType() == 1) {
				model.addAttribute("address", "tourist/tourist.jsp");
			}else if(user.getType() == 2) {
				model.addAttribute("address", "employee/employee.jsp");
			}else if(user.getType() == 3) {
				model.addAttribute("address", "employee/manager.jsp");
			}else if(user.getType() == 0) {
				model.addAttribute("address", "employee/admin.jsp");
			}
			return "tourist/wait";
		}else {
			model.addAttribute("msg", "登录失败！账号或密码有误");
			return "redirect:index";
		}
	}
	
	@RequestMapping("exit")
	public String exit(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:index";
	}

}
