package com.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashokit.response.StockCalcResponse;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceFeignClient {

	@GetMapping("/price/{companyName}")
	public StockCalcResponse getStockPrice(@PathVariable String companyName);

}
