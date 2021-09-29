package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.StockPriceEntity;

public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Serializable> {

	public StockPriceEntity findByCompanyName(String companyName);
	
}
