package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.User;

@Controller
public class UserNewController {

	@GetMapping("/loadformNew")
	public String loadUserForm() {
		return "index";
	}

	@PostMapping("/saveUserNew")
	public String handleSubmitBtn(User user, Model model) {

		System.out.println(user);

		model.addAttribute("msg", "User saved successfully..!!");

		return "success";
	}

}
