package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		String msgTxt = "Welcome to Ashok IT...!!";
		model.addAttribute("msg", msgTxt);
		return "welcome";
	}

	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msgTxt = "Good Morning...!!";
		model.addAttribute("msg", msgTxt);
		return "welcome";
	}

}
