package com.amit.result.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.result.Model.User;
import com.amit.result.Repository.UserRepo;

@RestController
public class Hcontroller {
	
	@Autowired
	UserRepo userrepo;
	
	@RequestMapping("/")
	public String value()
	{
	   return "Hello";
	}
	
	@GetMapping(path="/user", produces = "application/json")
	public String user()
	{
		return "Hello User/Admin";
	}
	
	@GetMapping(path="/admin", produces = "application/json")
	public String admin()
	{
		return "Hello Admin";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	    {
		    userrepo.save(user);
		    return user;
	    }
}
