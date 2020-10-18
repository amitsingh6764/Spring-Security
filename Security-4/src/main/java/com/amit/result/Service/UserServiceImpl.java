package com.amit.result.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amit.result.Model.User;
import com.amit.result.Repository.UserRepository;
import com.amit.result.utiles.LoginUtils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	    Optional<User> user	= userRepo.findByName(username);
	    user.orElseThrow(()->new UsernameNotFoundException("User not match in Database " +username));
		return user.map(LoginUtils::new).get();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName());
		return userRepo.save(user);
	}

}
