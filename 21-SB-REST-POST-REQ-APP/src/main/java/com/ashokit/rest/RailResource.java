package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.reponse.TicketInfo;
import com.ashokit.request.PassengerInfo;

@RestController
public class RailResource {

	@PostMapping(
			value="/book-ticket", 
			consumes = {"application/xml", "application/json"},
			produces = {"application/xml", "application/json"}
	)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger) {
		System.out.println(passenger);
		// logic to bookTicker

		TicketInfo tinfo = new TicketInfo();
		tinfo.setTicketId(123);
		tinfo.setTicketStatus("CONFIRMED");
		tinfo.setTicketPrice(450.00);

		return new ResponseEntity<TicketInfo>(tinfo, HttpStatus.CREATED);
	}
}
