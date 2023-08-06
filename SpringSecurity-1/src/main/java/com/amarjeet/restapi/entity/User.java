package com.amarjeet.restapi.entity;

import org.springframework.stereotype.Service;



@Service
public class User {
	private Long userId;
	private String userName;
	private Long userAge;
	private String userCity;
	private String userMail;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserAge() {
		return userAge;
	}

	public void setUserAge(Long userAge) {
		this.userAge = userAge;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userCity=" + userCity
				+ ", userMail=" + userMail + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userName, Long userAge, String userCity, String userMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userCity = userCity;
		this.userMail = userMail;
	}

}
