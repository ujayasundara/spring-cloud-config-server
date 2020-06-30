package com.udayanga.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	PropertyConfiguration propertyConfiguration;
	
	@GetMapping("/properties")
	public User getProperties() {
		
		return new User(propertyConfiguration.getFname(), propertyConfiguration.getLname(), propertyConfiguration.getAge());
	}
}
