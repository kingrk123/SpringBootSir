package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.GreetFeignClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFeignClient greetClient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome To Ashok IT..!!";

		String greetResponse = greetClient.invokeGreetApi();

		String finalResponse = greetResponse + " : " + msg;

		return finalResponse;
	}
}
