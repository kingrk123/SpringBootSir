package com.ashokit.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.reponse.TicketInfo;
import com.ashokit.request.PassengerInfo;

@Service
public class TicketBookService {

	public void ticketBooking() {

		String endpointUrl = "http://localhost:9090/book-ticket";

		RestTemplate template = new RestTemplate();

		// Preparing data to send in request body
		PassengerInfo pinfo = new PassengerInfo();
		pinfo.setFirstname("Ashok");
		pinfo.setLastname("Kumar");
		pinfo.setFrom("Hyd");
		pinfo.setTo("Banglore");
		pinfo.setJourneydate("2021-05-10");
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.set("Content-Type", "application/json");
		
		HttpEntity<PassengerInfo> entity = new HttpEntity<PassengerInfo>(pinfo, headers);
		
		ResponseEntity<TicketInfo> postForEntity = template.exchange(endpointUrl, HttpMethod.POST, entity, TicketInfo.class);

		//ResponseEntity<TicketInfo> postForEntity = template.postForEntity(endpointUrl, pinfo, TicketInfo.class);
		
		//TicketInfo postForObject = template.postForObject(endpointUrl, pinfo, TicketInfo.class);

		int statusCodeValue = postForEntity.getStatusCodeValue();
		if (statusCodeValue == 201) {
			System.out.println(postForEntity.getBody());
		}
	}

}
