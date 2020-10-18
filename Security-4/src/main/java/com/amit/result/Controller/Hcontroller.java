package com.amit.result.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hcontroller {
	
	@RequestMapping("/")	
	public String home()
	{
		
		return "Hello to ALL";
	}
    
	@RequestMapping("/user")
	public String user()
	{
		return "Hello to User/Admin";
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "Hello Admin";
	}
	
	@PostMapping("/addUser")
	public void addUser()
	{
		
	}
}
