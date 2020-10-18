package com.amit.result.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringConfig extends WebSecurityConfigurerAdapter {
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser("Amit")
		.password(encoder.encode("amit@321"))
		.roles("/USER")
		.and()
		.withUser("Admin")
		.password(encoder.encode("admin@321"))
		.roles("/ADMIN");
	}
	
	public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/user").hasAnyRole("/USER","/ADMIN")
		.antMatchers("/admin").hasRole("/ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}

}
