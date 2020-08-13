package com.microservices.micro.users.usersservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.micro.users.usersservice.entity.ERole;
import com.microservices.micro.users.usersservice.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	Optional<Role> findByName(ERole name);
	
}
