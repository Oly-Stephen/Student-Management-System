package com.university.studentmanagementsystem;

import com.university.studentmanagementsystem.entity.Student;
import com.university.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
}
