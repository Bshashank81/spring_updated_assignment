package com.assignment.springboot.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.springboot.thymeleaf.entity.Student;
import com.assignment.springboot.thymeleaf.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService theStudentService) {
		studentService = theStudentService;
	}
	
	//add mapping for list
	@GetMapping("/list")
	public String listStudents(Model theModel) {
		
		//get students from database
		List<Student> theStudents = studentService.findAll();
		
		//add to the spring model
		theModel.addAttribute("students",theStudents);
		
		return "list-students";
	}
	
}
