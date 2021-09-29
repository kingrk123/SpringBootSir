package com.ashokit.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@GetMapping("/customer")
	public String getCustomerName(@RequestParam("id") Integer customerId, Model model) {

		if (customerId == 101) {
			model.addAttribute("name", "John");
		} else if (customerId == 102) {
			model.addAttribute("name", "Steve");
		} else {
			model.addAttribute("name", "No Record Found");
		}

		return "customer-details";
	}

	@GetMapping("/test")
	public String getCustomerName(@RequestParam("id") Integer[] customerIds, Model model) {
		System.out.println("Ids recieved : " + Arrays.toString(customerIds));
		model.addAttribute("msg", "Id's recieved " + Arrays.toString(customerIds));
		return "customer-details";
	}

	@GetMapping("/customers")
	public String getCustomersCount(@RequestParam("area") String area, @RequestParam("age") Integer age, Model model) {

		String response = null;

		if ("Hyd".equals(area) && age >= 30) {
			response = "We have 125 Customers...";
		} else if ("Banglore".equals(area) && age >= 30) {
			response = "We have 220 Customers...";
		} else {
			response = "No Customers Available...";
		}

		model.addAttribute("msg", response);

		return "customer-details";
	}
}
