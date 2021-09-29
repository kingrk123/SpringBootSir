package com.ashokit.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@DeleteMapping(value = "/delete/{cid}")
	public String deleteCustomer(@PathVariable("cid") Integer customerId) {
		if (customerId >= 0) {
			// db logic to delete
			return "CUSTOMER DELETED SUCCESFULLY";
		} else {
			return "NO CUSTOMER FOUND";
		}
	}
}
