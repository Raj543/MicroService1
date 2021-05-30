package com.info;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableCircuitBreaker

public class ApiGateWayApp {
	public static final Logger log = 
			Logger.getLogger(ApiGateWayApp.class);

	public static void main(String[] args) {
		log.debug("In gateway server");
		SpringApplication.run(ApiGateWayApp.class, args);
	}
}
