package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient

public class M1SubApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(M1SubApplication.class, args);
		System.out.println("Sub app is started");
	}
}
