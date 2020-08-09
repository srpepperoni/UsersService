package com.microservices.micro.users.usersservice.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.microservices.micro.users.usersservice.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
