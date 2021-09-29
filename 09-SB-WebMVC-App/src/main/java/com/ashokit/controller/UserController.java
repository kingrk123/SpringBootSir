package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getUserData(Model model) {
		String username = "Ashok";
		String userDob = "20-May-1991";
		String userEmail = "ashokitschool@gmail.com";

		model.addAttribute("name", username);
		model.addAttribute("dob", userDob);
		model.addAttribute("email", userEmail);

		return "user";
	}
}
