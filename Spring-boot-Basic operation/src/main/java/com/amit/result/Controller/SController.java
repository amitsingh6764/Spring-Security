package com.amit.result.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.amit.result.Dao.UserDao;
import com.amit.result.Model.UserDetails;

@RestController
public class SController {
	
	@Autowired
	private UserDao use;
	
	@RequestMapping("/")
	public ModelAndView home()
	     {
		     ModelAndView mv = new ModelAndView();
		     mv.setViewName("Login.jsp");
		     return mv;
	     }
	//Insert Into MySql Database
	
	@RequestMapping("/AddUser")
	public ModelAndView Login1()
	     {
		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("Registration.jsp");
		    return mv;
	     }
	
	@PostMapping("/AddUser")
	public UserDetails Login(@RequestBody UserDetails user)
	     {

             use.save(user);
		     return user;
	     }
	
	//Autentication of User
	
	@RequestMapping("/GetUser")
	public ModelAndView GetUser(@RequestParam String uname,String Pass)
	{
		 
		 UserDetails uss = use.findByUname(uname);
		 ModelAndView mv = new ModelAndView();
		 if(uname.equalsIgnoreCase(uss.getUname()) & Pass.equalsIgnoreCase(uss.getPass()))
	    {
		    mv.addObject("name", uss.getUname());
		    mv.addObject("pass", uss.getPass());
		    mv.setViewName("Display.jsp");
	    }
	    else
	    	if(uname!=uss.getUname() & Pass!= uss.getPass())
	    {
	    	mv.setViewName("error.jsp");
	    }
		
	     return mv;
	}
	
	@RequestMapping("/Get/{Uid}")
	public Optional<UserDetails> GetCustomer(@PathVariable int Uid)
	{
		return use.findById(Uid);
	}
	
	@RequestMapping("/Get")
	public List<UserDetails> GetCustomer()
	{
		return use.findAll();
	}


}
