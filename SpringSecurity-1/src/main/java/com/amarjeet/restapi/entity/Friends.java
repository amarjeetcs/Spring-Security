package com.amarjeet.restapi.entity;

import org.springframework.stereotype.Service;

@Service
public class Friends {
	private String name;
	private String age;
	private String city;
	private String college;
	private String company;
	private String status;
	private String maritalStatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Friends(String name, String age, String city, String college, String company, String status,
			String maritalStatus) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.college = college;
		this.company = company;
		this.status = status;
		this.maritalStatus = maritalStatus;
	}
	@Override
	public String toString() {
		return "Friends [name=" + name + ", age=" + age + ", city=" + city + ", college=" + college + ", company="
				+ company + ", status=" + status + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
}
