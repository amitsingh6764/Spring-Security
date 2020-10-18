package com.amit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.amit.spring.dao.UserRepo;
import com.amit.spring.entity.User;

@Controller
public class Hcontroller {
	
	@Autowired
	UserRepo userrepo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/Etech")
	public ModelAndView etech()
	{
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("Etech.jsp");
	    return mv;
	}
	
	@RequestMapping("/Registration")
	public String registration()
	{
		return "Registration.jsp";
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(User user)
	    {
		    ModelAndView mv = new ModelAndView();
		    userrepo.save(user);
		    mv.setViewName("home.jsp");
		    return mv;
	    }
	
}
