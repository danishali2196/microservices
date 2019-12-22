package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms2ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2ServiceRegistryApplication.class, args);
	}

}
