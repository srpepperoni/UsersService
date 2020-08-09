package com.microservices.micro.users.usersservice.service;

import java.util.List;

import com.microservices.micro.users.usersservice.entity.Role;

public interface RoleService {

	public String getRoleById(Integer id);

	public List<Role> findAll();
}
