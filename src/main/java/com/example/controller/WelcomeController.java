package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "Welcome to izhar quraishi home");
		return "welcome";
	}

}
