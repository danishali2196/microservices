package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(value="/welcomeMsg")
	public String getMsg() {
		return "welcome client ..!!";	
	}
}
