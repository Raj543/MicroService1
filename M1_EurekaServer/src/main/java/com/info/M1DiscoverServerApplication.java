package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class M1DiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M1DiscoverServerApplication.class, args);
	}
}
