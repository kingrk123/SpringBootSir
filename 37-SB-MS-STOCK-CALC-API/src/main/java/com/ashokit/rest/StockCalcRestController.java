package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.StockPriceFeignClient;
import com.ashokit.response.StockCalcResponse;

@RestController
public class StockCalcRestController {

	@Autowired
	private StockPriceFeignClient client;

	@GetMapping("/cost/{companyName}/{qty}")
	public StockCalcResponse getCost(@PathVariable String companyName, @PathVariable Integer qty) {
		StockCalcResponse stockPrice = client.getStockPrice(companyName);
		stockPrice.setTotalCost(qty * stockPrice.getCompanyPrice());
		return stockPrice;
	}
}
