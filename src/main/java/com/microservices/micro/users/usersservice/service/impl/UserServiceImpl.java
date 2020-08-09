package com.microservices.micro.users.usersservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.micro.users.usersservice.entity.User;
import com.microservices.micro.users.usersservice.repository.UserRepository;
import com.microservices.micro.users.usersservice.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

}
