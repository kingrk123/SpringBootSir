package com.ashokit.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.bindings.Flight;
import com.ashokit.bindings.Flights;

@Service
public class FlightsService {

	public Flights getFlights() {

		Flights flights = null;

		RestTemplate rt = new RestTemplate();

		String restApiUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";

		ResponseEntity<Flights> forEntity = rt.getForEntity(restApiUrl, Flights.class);

		int status = forEntity.getStatusCodeValue();

		if (status == 200) {
			flights = forEntity.getBody();
		}
		return flights;
	}
}
