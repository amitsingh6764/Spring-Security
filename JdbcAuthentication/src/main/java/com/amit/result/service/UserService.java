package com.amit.result.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amit.result.dao.UserPrinciple;
import com.amit.result.dao.UserRepo;
import com.amit.result.entity.User;

@Service
public class UserService implements UserDetailsService {

	
	@Autowired
	UserRepo userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	    Optional<User> user = userrepo.findByUsername(username);
	    User u = user.orElseThrow(() -> new UsernameNotFoundException("Username not Found"));
	    return new UserPrinciple(u);
	}

}
