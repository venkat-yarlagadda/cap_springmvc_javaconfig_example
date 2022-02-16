package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
public class WebController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public String userPage(@Validated User user, Model model) {
		List<User> l = new ArrayList();
		l.add(user);
		User u = new User();
		u.setUserName("Shakir");
		User u1 = new User();
		u1.setUserName("Kumar");
		User u2 = new User();
		u2.setUserName("Jyothi");
		l.add(u);
		l.add(u1);
		l.add(u2);
		model.addAttribute("user",l);
		
		return "user";
	}
}
