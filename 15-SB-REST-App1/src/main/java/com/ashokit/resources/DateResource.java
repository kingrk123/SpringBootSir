package com.ashokit.resources;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date")
public class DateResource {

	@GetMapping
	public String getTodayDate() {
		String msg = "Today's Date :: " + new Date();
		return msg;
	}
}
