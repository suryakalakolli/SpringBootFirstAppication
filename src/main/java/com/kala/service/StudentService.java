package com.kala.service;

import java.util.List;

import com.kala.model.Student;

public interface StudentService {
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Student getOneStudent(Integer id);
	List<Student> getAllStudents();
	

}
