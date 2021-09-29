package com.ashokit.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarResource {

	@GetMapping(value = "/car/{carId}/data")
	public String getColor(@PathVariable("carId") Integer carId) {

		String msg = "";

		if (carId == 101) {
			msg = "Car color is Red";
		} else if (carId == 102) {
			msg = "Car color is White";
		} else {
			msg = "No Car available";
		}

		return msg;
	}

	@GetMapping(value = "/check/{color}/{brand}")
	public ResponseEntity<String> checkAvailability(@PathVariable String color, @PathVariable String brand) {

		String msg = "";
		if ("red".equals(color) && "swift".equals(brand)) {
			msg = "Cars Available....!!";
		} else if ("black".equals(color) && "swift".equals(brand)) {
			msg = "Cars Not Available...!!";
		}

		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
