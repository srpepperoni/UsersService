package com.microservices.micro.users.usersservice.service;

import java.util.List;

import com.microservices.micro.users.usersservice.entity.User;

public interface UserService {
	
	public List<User> findAll();

}
