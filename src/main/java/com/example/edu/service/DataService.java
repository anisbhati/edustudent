package com.example.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.edu.model.Student;

@Service
public interface DataService {
	
	public String addStudent(Student s);
	public List<Student>  getAllStudent();

}
