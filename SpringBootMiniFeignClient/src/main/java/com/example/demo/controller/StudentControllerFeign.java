package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.example.demo.entity.StudentModel;
import com.example.demo.feignInterface.StudentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class StudentControllerFeign {
	
	@Autowired 
	 StudentDetails details;
	
//	@Value("${server.port}")
//	public String portNo;
	
	@GetMapping
	@CircuitBreaker(fallbackMethod = "getResponse", name = "student")
	public List<StudentModel> getAllStudentDetails()
	{

		return details.getAllStudentDetails();
	}
	
	public List<String> getResponse(RuntimeException exception)
	{
		return Arrays.asList("Student Details are Under Verification....");
	}

}
