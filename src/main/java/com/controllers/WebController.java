package com.controllers;

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
		model.addAttribute("user",user);
		return "user";
	}
}
