package com.microservices.micro.users.usersservice.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "roles", uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") 
	})
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private Date birthday;
    private Set<Role> roles = new HashSet<>();
    private Long points;
    
    @NotBlank
	@Size(max = 20)
    private String username;

    @NotBlank
	@Size(max = 120)
    private String password;
    
    @NotBlank
	@Size(max = 50)
	@Email
    private String email;
    
    public User(String username, String email, String password) {
    	super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
    
}

