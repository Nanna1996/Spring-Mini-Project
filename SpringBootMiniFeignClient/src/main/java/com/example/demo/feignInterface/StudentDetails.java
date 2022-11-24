package com.example.demo.feignInterface;

import java.util.List;

import com.example.demo.entity.StudentModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "STUDENTSERVICE")
public interface StudentDetails {
	
	@GetMapping("/api/getStudent")
	public List<StudentModel> getAllStudentDetails();

}
