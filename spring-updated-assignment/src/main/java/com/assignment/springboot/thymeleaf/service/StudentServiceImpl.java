package com.assignment.springboot.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springboot.thymeleaf.dao.StudentRepository;
import com.assignment.springboot.thymeleaf.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository theStudentRepository) {
		studentRepository = theStudentRepository;
	}
	
	@Override
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
}
