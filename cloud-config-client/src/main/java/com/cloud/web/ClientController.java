package com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/config")
	public String getConfig() {
		return environment.getProperty("test.user.name");
	}
}
