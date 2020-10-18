package com.amit.result.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.result.Model.UserDetails;

public interface UserDao extends JpaRepository<UserDetails,Integer> {
	
	UserDetails findByUname(String uname);
	}
