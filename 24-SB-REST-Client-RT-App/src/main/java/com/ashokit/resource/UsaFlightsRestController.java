package com.ashokit.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.Flights;
import com.ashokit.service.FlightsService;

@RestController
public class UsaFlightsRestController {

	@Autowired
	private FlightsService service;

	@GetMapping(value = "/flights", produces = { "application/xml", "application/json" })
	public ResponseEntity<Flights> getUsaFlights() {
		
		Flights flights = service.getFlights();
		
		return new ResponseEntity<>(flights, HttpStatus.OK);
	}
}
