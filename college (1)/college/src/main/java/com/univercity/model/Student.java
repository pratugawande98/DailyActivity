package com.univercity.model;

@bean
public class Student {
	int rollNo;
	int EnrollmentNumber;
	String name;
	
	public void student(int rollNo, int EnrollmentNumber,  String name) {
	this.rollNo= rollNo;
	this.EnrollmentNumber= EnrollmentNumber;
	this.name= name;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getEnrollmentNumber() {
		return EnrollmentNumber;
	}
	public void setEnrollmentNumber(int enrollmentNumber) {
		EnrollmentNumber = enrollmentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", EnrollmentNumber=" + EnrollmentNumber + ", name=" + name + "]";
	}


	}
	

