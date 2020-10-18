package com.amit.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amit.spring.dao.UserPrinciple;
import com.amit.spring.dao.UserRepo;
import com.amit.spring.entity.User;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	 UserRepo userrepo;
	public UserDetails loadUserByUsername(String username) {
		 Optional<User> user = userrepo.findByUsername(username);
		    User u = user.orElseThrow(() -> new UsernameNotFoundException("Username not Found"));
		    return new UserPrinciple(u);
	}

}
