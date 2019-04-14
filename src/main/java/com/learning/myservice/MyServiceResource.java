
package com.learning.myservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyServiceResource {
	
	@Autowired
	Environment env;
	
	@GetMapping("/my-service")
	public String retrieveFromConfig() {
		
		return "Fetch configs from Cloud : "+ env.getProperty("ENV") ;
		
	}

}
