package com.example.edu;




import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.edu.model.Student;
import com.example.edu.service.DataService;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.example.edu")
public class EduStudentApiApplication {
     @Autowired
     DataService d;
	public static void main(String[] args) {
		SpringApplication.run(EduStudentApiApplication.class, args);
	}
	
	@PostConstruct
	public void addDefault() {
		Student s=new Student();
		s.setSaddress("abbc");
		s.setSadhaar("abvd");
		s.setSmail("asdf");
		s.setSmob(22234324);
		s.setSname("dfgfd");
		d.addStudent(s);
	}

}
