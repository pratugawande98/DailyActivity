package com.univercity.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.univercity.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>
{
	public Optional<Student>getUserByEmail(String email);


}
