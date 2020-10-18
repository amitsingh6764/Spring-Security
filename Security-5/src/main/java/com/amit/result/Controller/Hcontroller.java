package com.amit.result.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.result.Model.Student;
import com.amit.result.Repository.StudentRepo;

@RestController
public class Hcontroller {
	
	@Autowired
	StudentRepo opo;

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
	public void addUser(Student student)
	{
		opo.save(student);
	}
}
