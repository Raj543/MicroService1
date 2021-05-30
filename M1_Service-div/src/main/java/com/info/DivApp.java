package com.info;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DivApp {
	
	public static final Logger log= 
			Logger.getLogger(DivApp.class);

	public static void main(String[] args) {
		SpringApplication.run(DivApp.class, args);
		log.debug("Div service is Started");
	}

}
