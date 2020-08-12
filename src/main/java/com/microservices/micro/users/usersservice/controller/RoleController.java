package com.microservices.micro.users.usersservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.micro.users.usersservice.service.RoleService;

@RestController
public class RoleController {
	
	private RoleService roleService;
	
	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@GetMapping("/role/{id}")
	public String getRoleById(@PathVariable("id") Integer id) {
		return roleService.getRoleById(id);
	}

}
