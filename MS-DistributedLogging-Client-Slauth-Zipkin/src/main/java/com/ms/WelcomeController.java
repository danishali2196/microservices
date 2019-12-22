package com.ms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/msg")
	public String getMsg() {
		logger.info("getMsg() method is started");
		String msg = "welcome to rest api";
		logger.info("getMsg() method is ended");
		return msg;
	}
}
