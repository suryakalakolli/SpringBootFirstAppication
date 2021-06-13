package com.kala.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kala.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	//dynamic proxy

}
