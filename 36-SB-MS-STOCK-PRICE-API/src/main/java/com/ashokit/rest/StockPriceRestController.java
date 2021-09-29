package com.ashokit.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.StockPriceEntity;
import com.ashokit.repo.StockPriceRepository;
import com.ashokit.response.StockPriceResponse;

@RestController
public class StockPriceRestController {

	@Autowired
	private StockPriceRepository repo;

	@Autowired
	private Environment env;

	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPriceResponse> getPrice(@PathVariable String companyName) {

		StockPriceEntity stockEntity = repo.findByCompanyName(companyName);

		StockPriceResponse response = new StockPriceResponse();

		BeanUtils.copyProperties(stockEntity, response);

		String port = env.getProperty("local.server.port");

		response.setPortNumber(Integer.parseInt(port));

		return new ResponseEntity<StockPriceResponse>(response, HttpStatus.OK);

	}

}
