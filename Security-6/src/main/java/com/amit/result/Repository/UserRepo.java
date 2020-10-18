package com.amit.result.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amit.result.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
}
