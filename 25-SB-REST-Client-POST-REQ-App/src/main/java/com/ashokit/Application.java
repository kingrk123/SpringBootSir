package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.SsnService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		SsnService bean = run.getBean(SsnService.class);
		String invokeSsnApi = bean.invokeSsnApi();
		System.out.println(invokeSsnApi);
	}

}
