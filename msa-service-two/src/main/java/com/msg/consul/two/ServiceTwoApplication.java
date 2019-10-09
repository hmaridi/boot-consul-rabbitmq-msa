package com.msg.consul.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.msg.consul.two.service.NameValueService;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTwoApplication extends SpringBootServletInitializer {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(ServiceTwoApplication.class, args);
		context.getBean(NameValueService.class)
				.generateUUID(context.getEnvironment().getProperty("spring.application.name"));
	}

}