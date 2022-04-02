package com.example.SpringBootRequestResponseLoggingFilter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringBootRequestResponseLoggingFilter.model.Student;

@Service
public class StudentService {

	public List<Student> getAllStudent() {
		return List.of(new Student(1, "abc", "dlh"), new Student(2, "mohit", "hyd"),
				new Student(3, "lucky", "dlh"));
	}

}
