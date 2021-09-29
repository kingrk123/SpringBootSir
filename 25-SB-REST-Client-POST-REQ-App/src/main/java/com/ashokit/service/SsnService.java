package com.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.domain.CitizenInfo;

@Service
public class SsnService {

	public String invokeSsnApi() {
		String msg = null;

		// Setting input data for Rest API
		CitizenInfo requestData = new CitizenInfo("Ashok", "Kumar", "M", "2021-04-08", "NJ");
		String apiUrl = "http://localhost:9090/enrollment";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, requestData, String.class);
		int statusCodeValue = postForEntity.getStatusCodeValue();
		if (statusCodeValue == 201) {
			msg = postForEntity.getBody();
		}
		return msg;
	}

}
