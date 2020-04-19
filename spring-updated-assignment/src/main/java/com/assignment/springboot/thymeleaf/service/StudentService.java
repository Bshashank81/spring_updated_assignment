package com.assignment.springboot.thymeleaf.service;

import java.util.List;

import com.assignment.springboot.thymeleaf.entity.Student;

public interface StudentService {
	
	List<Student> findAll();
}
