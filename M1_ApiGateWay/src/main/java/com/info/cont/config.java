package com.info.cont;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {
	@Bean
	@LoadBalanced
	public RestTemplate getTem() {
		return new RestTemplate();
	}
}
