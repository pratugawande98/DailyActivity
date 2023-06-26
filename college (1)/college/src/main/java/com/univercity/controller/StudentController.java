package com.univercity.controller;

import java.util.Optional;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.univercity.model.Student;

@Service
public class StudentServices {
	
	@GetMapping("/findPercentage/{id}")
	
	public ResponseEntity<?>getUserById(@PathVariable String id){
		try {
			Optional<Student> user = StudentService.getById(id);
			return new ResponseEntity<>(user,HttpStatus.OK);
			
		}catch(Exception e) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}

}

