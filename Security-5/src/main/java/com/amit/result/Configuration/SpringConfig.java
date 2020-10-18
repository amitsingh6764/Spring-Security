package com.amit.result.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.amit.result.Service.StudentServiceImpl;

@Configuration
@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	StudentServiceImpl userservice;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		PasswordEncoder pass = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.userDetailsService(userservice);
	}
	
      public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/admin").hasRole("/ADMIN")
		.antMatchers("/user").hasAnyRole("/USER","/ADMIN")
		.and().formLogin()
		.and().logout();
	}
	
	/*@Bean
	public PasswordEncoder pass()
	{
		return NoOpPasswordEncoder.getInstance();
	}*/

}
