package com.amit.spring.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amit.spring.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	Optional<User> findByUsername(String username);
}
