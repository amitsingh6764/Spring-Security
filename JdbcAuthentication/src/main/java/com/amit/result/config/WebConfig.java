package com.amit.result.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.amit.result.service.UserService;

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	UserService userService;
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userService);
	}
	
	public void configure(HttpSecurity http) throws Exception
	{
		http.cors().and().csrf().disable();
		http.authorizeRequests()
		.antMatchers("/addUser").permitAll()
		.antMatchers("/home").authenticated()
		.and().formLogin()
		.and().logout();
	}
	
	@Bean
	public PasswordEncoder pass()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
}
