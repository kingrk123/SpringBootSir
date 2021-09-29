package com.ashokit.response;

import lombok.Data;

@Data
public class StockCalcResponse {

	private String companyName;
	private Double companyPrice;
	private Integer portNumber;
	private Double totalCost;

}
