package com.amit.result.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amit.result.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student findByUsername(String username);
}
