package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms1SbWelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1SbWelcomeApplication.class, args);
	}

}
