package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

		int beanDefinitionCount = run.getBeanDefinitionCount();

		System.out.println("Bean Def Count :: " + beanDefinitionCount);
	}
}
