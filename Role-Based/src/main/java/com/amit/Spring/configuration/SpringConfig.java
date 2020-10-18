package com.amit.Spring.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SpringConfig extends WebSecurityConfigurerAdapter{
	
	public void configure(HttpSecurity http)
	{
		
	}
	
	public void configure(AuthenticationManagerBuilder auth)
	{
		
	}
	
	public PasswordEncoder pass()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
