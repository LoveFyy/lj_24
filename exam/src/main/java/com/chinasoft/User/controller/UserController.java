package com.chinasoft.User.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.User.pojo.User;
import com.chinasoft.User.service.UserException;
import com.chinasoft.User.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("exam")
	public String exam() {
		return "home";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam String username,
			String password, String email, String phone, String province,
			String company, String department) throws UserException {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setProvince(province);
		user.setCompany(company);
		user.setDepartment(department);
		userService.register(user);
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}
