package com.univercity.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.univercity.model.Student;


@Service
public class StudentServices {
	public Student get(Integer id)
	{
		
		return repository.findById(id).get();
	}
	
}
	
	