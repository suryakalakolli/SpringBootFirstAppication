package com.kala.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kala.model.Student;
import com.kala.repo.StudentRepository;
import com.kala.service.StudentService;
import com.kala.service.impl.utils.StudentUtil;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository stdRepo;
	
	@Override
	public Integer saveStudent(Student s) {
	
	StudentUtil.calculate(s);
	
	    s= stdRepo.save(s);
		return s.getStdId();
		
	//	Iterable<S> saveAll(Iterable<S> entities)
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		StudentUtil.calculate(s);
		stdRepo.save(s);
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		stdRepo.deleteById(id);
	}

	@Override
	public Student getOneStudent(Integer id) {
	Optional<Student> opt = stdRepo.findById(id);
	if(opt.isPresent()) {
		return opt.get();
		
	}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return stdRepo.findAll();
	}

}
