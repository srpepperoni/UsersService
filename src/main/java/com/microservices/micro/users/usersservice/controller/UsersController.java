package com.microservices.micro.users.usersservice.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	private static final String template = "Hello, %s!";
	public static final String EXCHANGE_NAME = "warehouseexchange";
	
	private final RabbitTemplate rabbitTemplate;
	
	public UsersController(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@GetMapping(value="/test")
	public String test() {
		return "Hello World from Users Service";
	}
	
	@GetMapping("/greeting/{name}")
    public String greeting2(@PathVariable("name") String name) {
        return String.format(template, name) ;		
    }
	
	@GetMapping("/send/{message}")
    public String sendMessage(@PathVariable("message") String themessage){
        rabbitTemplate.convertAndSend(EXCHANGE_NAME,
                "warehouse.stock.down", themessage);
        return "We have sent a message! :" + themessage;
    }
	
}
