package com.microservices.micro.users.usersservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.microservices.micro.users.usersservice.entity.Role;
import com.microservices.micro.users.usersservice.repository.RoleRepository;
import com.microservices.micro.users.usersservice.service.RoleService;

@Component
public class RoleServiceImpl implements RoleService{
	
    private RoleRepository repository;
	
	public RoleServiceImpl(RoleRepository repository) {
		this.repository = repository;
	}

    @Override
    public List<Role> findAll() {
        return (List<Role>) repository.findAll();
    }

	@Override
	public String getRoleById(Integer id) {
		Optional<Role> role = repository.findById(Long.valueOf(id));
		return role.orElse(null) != null ? role.orElse(null).getName() : null;
	}

}
