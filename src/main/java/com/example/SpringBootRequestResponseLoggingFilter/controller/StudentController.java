package com.example.SpringBootRequestResponseLoggingFilter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRequestResponseLoggingFilter.model.Student;
import com.example.SpringBootRequestResponseLoggingFilter.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("students")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
}
