package com.amit.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.amit.spring.service.UserService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserService userService;
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userService);
	}
	
	public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/addUser").permitAll()
		.antMatchers("/Registration").permitAll()
		.antMatchers("/Etech").authenticated()
		.and().formLogin()
		.and().logout();		
	}

	@Bean
	public PasswordEncoder password()
	{
		return NoOpPasswordEncoder.getInstance();
	}
}
