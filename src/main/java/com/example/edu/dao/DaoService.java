package com.example.edu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.edu.model.Student;
import com.example.edu.repository.StudentRepository;


@Service
@Component
public class DaoService {
     
	@Autowired
	StudentRepository srepo;
	
	public String addStudent(Student s) {
		try {
			srepo.save(s);
			return "data saved ... ";
		}catch (Exception e) {
			// TODO: handle exception
			return "somthing went wrong ...";
		}
		
		}
	
	    public java.util.List<Student> getAllStuData(){
	    	java.util.List<Student> l=(java.util.List<Student>) srepo.findAll();
	    	return l;
	    	
	    }
	
}
