package com.iotek.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.InterviewService;
import com.iotek.ssm.service.UserService;
import com.iotek.ssm.util.App;

@RequestMapping("/user")
@Controller("userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private InterviewService interviewService;
	
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
			req.setAttribute("msg", "�޸ĳɹ���");
		}else {
			req.setAttribute("msg", "�޸�ʧ�ܣ�");
		}
		return "tourist/tourist";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(Model model, HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//type = 1���ο�  2��Ա��  3������  0������Ա
		int res = userService.addUser(new User(0,username,App.md5(password),1));
		if(res > 0) {
			model.addAttribute("msg1","��ϲ����ע��ɹ�");
			model.addAttribute("msg2","���ص�¼");
			model.addAttribute("address","index.jsp");
			return "tourist/wait";
		}else {
			model.addAttribute("msg", "ע��ʧ��");
			return "redirect:index";
		}
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session, Model model, String username, String password) {
		User user = userService.queryUserByUsername(username);
		if(user != null && App.md5(password).equals(user.getPassword())) {
			model.addAttribute("msg1","��ϲ������¼�ɹ���");
			model.addAttribute("msg2","������˽���");
			session.setAttribute("user", user);
			Interview inter = null;
			if(user.getType() == 1) {
				inter = interviewService.queryById(user.getuId());
				if(inter.getForInter() != null && inter.getEmploy().equals("δ¼ȡ")) {
					session.setAttribute("msg", "֪ͨ������һ������֪ͨ���������� ���� �в鿴");
				}
				model.addAttribute("address", "tourist/tourist.jsp");
			}else if(user.getType() == 2) {
				model.addAttribute("address", "employee/employee.jsp");
			}else if(user.getType() == 3) {
				inter = interviewService.queryById(user.getuId());
				if(inter.getForInter() != null && inter.getEmploy().equals("δ¼ȡ")) {
					session.setAttribute("msg", "֪ͨ������һ������֪ͨ���������� ���� �в鿴");
				}
				//TODO ��ѵ֪ͨ��ѯ��ʾ
				model.addAttribute("address", "employee/manager.jsp");
			}else if(user.getType() == 0) {
				model.addAttribute("address", "employee/admin.jsp");
			}
			return "tourist/wait";
		}else {
			model.addAttribute("msg", "��¼ʧ�ܣ��˺Ż���������");
			return "redirect:index";
		}
	}
	
	@RequestMapping("exit")
	public String exit(HttpSession session) {
		session.setAttribute("user", null);
		return "redirect:index";
	}

}
