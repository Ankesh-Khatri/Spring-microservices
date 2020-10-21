package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitConfig() {
		//return new LimitConfiguration(1000, 1);
		
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}
}
