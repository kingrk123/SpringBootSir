package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.ResourceDtls;
import com.ashokit.repository.ResourceDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ResourceDtlsRepository resourceDtlsRepo = context.getBean(ResourceDtlsRepository.class);

		ResourceDtls resource = new ResourceDtls();
		resource.setResourceName("Kumar");
		resource.setResourceSkill("Java");
		resource.setResourceExp("Fresher");

		resource = resourceDtlsRepo.save(resource);

		if (resource != null) {
			System.out.println("Record saved....");
		} else {
			System.out.println("Failed to save the record....");
		}
	}
}
