package com.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/msg")
	public String getMsg() {
		String msg = "Good Mrng...!!";
		return msg;
	}
}
