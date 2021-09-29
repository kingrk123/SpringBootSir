package com.ashokit.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashokit.entity.ResourceDtls;
import com.ashokit.repository.ResourceDtlsRepository;

@Service
public class ResourceService {

	private ResourceDtlsRepository resourceDtlsRepo;

	public ResourceService(ResourceDtlsRepository resourceDtlsRepo) {
		this.resourceDtlsRepo = resourceDtlsRepo;
	}

	@Transactional(rollbackFor = { RuntimeException.class })
	public void saveResources() {
		ResourceDtls res1 = new ResourceDtls();
		res1.setResourceName("John");
		res1.setResourceSkill("PHP");
		res1.setResourceExp("Two Years");
		resourceDtlsRepo.save(res1);

		//int i = 10;

		ResourceDtls res2 = new ResourceDtls();
		res2.setResourceName("Peter");
		res2.setResourceSkill("AWS");
		res2.setResourceExp("3 Years");
		resourceDtlsRepo.save(res2);
	}
}
