package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to Ashok IT";

		String portNo = env.getProperty("local.server.port");

		String finalResponse = msg + " : Response Came From Server Which Is Running On Port No : " + portNo;

		return finalResponse;
	}
}
