package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MsAdminUiServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminUiServer1Application.class, args);
	}

}
