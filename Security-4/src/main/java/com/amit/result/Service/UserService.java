package com.amit.result.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.amit.result.Model.User;

public interface UserService extends UserDetailsService {
	
	User save(User user);

}
