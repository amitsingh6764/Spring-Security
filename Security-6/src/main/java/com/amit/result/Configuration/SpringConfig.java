package com.amit.result.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("Amit")
		.password("amit@321")
		.roles("/USER")
		.and()
		.withUser("Admin")
		.password("admin@321")
		.roles("/ADMIN");
	}
	
  	public void configure(HttpSecurity http) throws Exception
	{
  		http.cors().and().csrf().disable();
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/addUser").permitAll()
		.antMatchers("/user").hasAnyRole("/USER","/ADMIN")
		.antMatchers("/admin").hasRole("/ADMIN")
		.and().formLogin()
		.and().logout();
	}
  	
  	@Bean
	public PasswordEncoder pass()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
}
