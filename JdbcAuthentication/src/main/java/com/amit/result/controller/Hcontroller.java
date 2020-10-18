package com.amit.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.result.dao.UserPrinciple;
import com.amit.result.dao.UserRepo;
import com.amit.result.entity.User;
import com.amit.result.service.UserService;

@RestController
public class Hcontroller {
	
	@Autowired
	UserRepo userrepo;
	
	@RequestMapping("/home")
	public String value()
	{
		return "Hello";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	    {
		    userrepo.save(user);
		    return user;
	    }
	

}
