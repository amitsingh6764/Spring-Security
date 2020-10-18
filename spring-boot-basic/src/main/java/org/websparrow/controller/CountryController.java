package org.websparrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.websparrow.entity.UserDetails;
import org.websparrow.repository.UserRepository;
@RestController
public class CountryController {

	@Autowired
	UserRepository users;
	
	@RequestMapping("/")
	public ModelAndView home()
	     {
		     ModelAndView mv = new ModelAndView();
		     mv.setViewName("Login.jsp");
		     return mv;
	     }

	// insert new country into database
	@PostMapping("/AddUser")
	public ModelAndView addCountry(@RequestBody UserDetails user) {

		 users.save(user);
	     System.out.println(user.getUname());
	     System.out.println(user.getPass());
	     ModelAndView mv = new ModelAndView();
	     mv.setViewName("Login.jsp");
	     return mv;
	}

}
