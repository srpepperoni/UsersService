package com.microservices.micro.users.usersservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	private static final String template = "Hello, %s!";
	
	@GetMapping(value="/test")
	public String test() {
		return "Hello World from Users Service";
	}
	
	@GetMapping("/greeting/{name}")
    public String greeting2(@PathVariable("name") String name) {
        return String.format(template, name) ;		
    }
	
}
