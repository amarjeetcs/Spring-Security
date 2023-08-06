package com.amarjeet.restapi.entity;

import org.springframework.stereotype.Service;

@Service
public class Employee {
	private String StudentName;
	private String studentAge;
	private String studentCity;
	private String studentCountry;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentCountry() {
		return studentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String studentName, String studentAge, String studentCity, String studentCountry) {
		super();
		StudentName = studentName;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.studentCountry = studentCountry;
	}

	@Override
	public String toString() {
		return "Employee [StudentName=" + StudentName + ", studentAge=" + studentAge + ", studentCity=" + studentCity
				+ ", studentCountry=" + studentCountry + "]";
	}

}
