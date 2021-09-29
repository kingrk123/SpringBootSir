package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeResource {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to Restful Services...!!";
		return msg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Morning..!!";
		return msg;
	}

	@PostMapping("/user")
	public String adduser() {
		// logic to store in db
		return "user added";
	}

}
