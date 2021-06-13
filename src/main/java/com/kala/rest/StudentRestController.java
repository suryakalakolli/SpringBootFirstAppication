package com.kala.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kala.model.Student;
import com.kala.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentRestController {
  @Autowired
  private StudentServiceImpl service;
  
  //save
    @PostMapping("/create")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
    Integer id	 = service.saveStudent(student);
    	String body = "Student Saved With Id "+id;
    	return ResponseEntity.ok(body);
    	
    }
	
    //fetech all
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
    	List<Student> list = service.getAllStudents();
		return ResponseEntity.ok(list);
    	
    }
    
    //fetch one
    @GetMapping("/one/{id}")
    public ResponseEntity<Student> getOneStudent(@PathVariable Integer id){
    
    	 Student s =service.getOneStudent(id);
		return ResponseEntity.ok(s);
    	
    }
  //delete
     @DeleteMapping("/remove{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
    	service.deleteStudent(id);
    	String body ="deleted succefuully"+id;
		return ResponseEntity.ok(body);
    	
    }
     @PutMapping("/update")
     public <S> ResponseEntity<String> update(@RequestBody Student s){
          service.updateStudent(s);
    	 String body = "student updated"+s.getStdId();
		return ResponseEntity.ok(body);
    	 
     }
    
    
    
    
    
    
    
    
}
