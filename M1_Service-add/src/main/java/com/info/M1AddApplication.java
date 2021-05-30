package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class M1AddApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(M1AddApplication.class, args);
		System.out.println("Add app is called");
	}
}
