package com.microservices.micro.users.usersservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.microservices.micro.users.usersservice.entity.User;
import com.microservices.micro.users.usersservice.repository.UserRepository;
import com.microservices.micro.users.usersservice.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
    private UserRepository repository;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

}
