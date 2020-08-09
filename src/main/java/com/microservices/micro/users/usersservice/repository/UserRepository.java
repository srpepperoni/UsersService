package com.microservices.micro.users.usersservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.micro.users.usersservice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
