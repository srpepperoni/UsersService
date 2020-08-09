package com.microservices.micro.users.usersservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.micro.users.usersservice.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role/{id}")
	public String getRoleById(@PathVariable("id") Integer id) {
		return roleService.getRoleById(id);
	}

}
