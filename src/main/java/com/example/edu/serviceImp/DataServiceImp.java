package com.example.edu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.edu.dao.DaoService;
import com.example.edu.model.Student;
import com.example.edu.service.DataService;
@Component
public class DataServiceImp implements DataService{
	
	@Autowired
	DaoService d;

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		
		return d.addStudent(s);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return d.getAllStuData();
	}

}
