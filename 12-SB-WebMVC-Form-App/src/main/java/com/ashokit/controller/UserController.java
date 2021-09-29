package com.ashokit.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.model.User;

@Controller
public class UserController {

	@GetMapping("/loadform")
	public String loadUserForm() {
		return "index";
	}

	@PostMapping("/saveUser")
	public String handleSubmitBtn(HttpServletRequest req, Model model) {

		String uid = req.getParameter("uid");
		String uname = req.getParameter("uname");
		String uphn = req.getParameter("uphn");

		User user = new User();
		user.setUid(Integer.parseInt(uid));
		user.setUname(uname);
		user.setUphn(Long.parseLong(uphn));

		model.addAttribute("msg", "User saved successfully..!!");

		return "success";
	}

}
