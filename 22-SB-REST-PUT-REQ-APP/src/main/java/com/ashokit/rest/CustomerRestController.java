package com.ashokit.rest;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.Customer;

@RestController
public class CustomerRestController {

	@PutMapping(
			value = "/update",
			consumes = {"application/json", "application/xml"},
			produces = {"text/plain"}
	)
	public String updateCustomer(@RequestBody Customer c) {
		
		System.out.println(c);

		if (c.getCustomerId() >= 0) {
			// db logic to update
			return "Customer Updated Succesfully";
		} else {
			return "No Customer Found";
		}
	}
}
