package com.amit.result.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
        @RequestMapping("/")
		public String home()
		{
			return "WELCOME TO HOME PAGE";
		}
	
        @RequestMapping("/user")
		public String login()
		{
			return "Hello User/Admin";
		}
        

        @RequestMapping("/admin")
		public String logout()
		{
			return "Hello Admin";
		}


}
