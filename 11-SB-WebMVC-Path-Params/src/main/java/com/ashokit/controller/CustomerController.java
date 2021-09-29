package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	@GetMapping("/customer/{cid}/data")
	public String getCustomerName(@PathVariable("cid") Integer customerId, Model model) {
		if (customerId == 101) {
			model.addAttribute("name", "John");
		} else if (customerId == 102) {
			model.addAttribute("name", "Steve");
		} else {
			model.addAttribute("name", "No Record Found");
		}
		return "customer-details";
	}

	@GetMapping("/email/{cid}")
	public @ResponseBody String getCustomerEmail(@PathVariable Integer cid) {
		if (cid == 101) {
			return "john.p@in.com";
		} else if (cid == 102) {
			return "smith.k@gmail.com";
		}
		return "No Data Found";
	}
}
