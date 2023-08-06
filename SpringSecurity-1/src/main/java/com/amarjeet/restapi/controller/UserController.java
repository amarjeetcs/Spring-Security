package com.amarjeet.restapi.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarjeet.restapi.entity.Employee;
import com.amarjeet.restapi.entity.Friends;
import com.amarjeet.restapi.entity.User;

@RestController
public class UserController {

	@Autowired
	private User user;

	@Autowired
	private Employee employee;

	@Autowired
	private Friends friends;

	@GetMapping("/getMapDetails")
	public Map<String, String> getDetails() {
		return Map.of("Name", "Amarjeet Kumar Singh", "City", "Bangalore", "email", "amarjeetcs79@gmail.com");
	}

	@GetMapping("/getListOfObjects")
	public List<String> getAllList() {
		return List.of("Amarjeet", "Sanjeet", "Rajnish", "Hira", "Nikki");
	}

	@GetMapping("/filterList")
	public List<Integer> getAllStudents() {
		return List.of(1, 2, 3, 4, 5).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
	}

	@GetMapping("/getEmployee1")
	public List<Employee> getEmployee1() {
		return List.of(new Employee("Amarjeet", "22", "bangalore", "india"),
				new Employee("Sanjeet", "23", "Siwan", "india"), new Employee("Benu", "27", "bangalore", "india"),
				new Employee("Tapas", "24", "bangalore", "india"), new Employee("Hira", "20", "Pune", "india"),
				new Employee("Rajnish", "28", "bangalore", "india"), new Employee("Subham", "24", "bangalore", "india"),
				new Employee("Rohit", "25", "bangalore", "india"), new Employee("Anand", "20", "Bihar", "india"),
				new Employee("Keshav", "24", "Bihar", "india"), new Employee("swati", "24", "Bhopal", "india"),
				new Employee("Somi", "24", "Bhopal", "india"), new Employee("Ketul", "24", "Bhopal", "india"));

	}

	@GetMapping("/getFriends")
	public List<Friends> getFriendsDetails() {
		return List.of(new Friends("Amarjeet", "22", "bangalore", "Ies college bhopal","Edifecs","Not working","Not Married"),
				new Friends("Sanjeet", "23", "bangalore", "Ies college bhopal","Edifecs","working","Not Married"),
				new Friends("Anwar", "24", "bangalore", "Ies college bhopal","Edifecs","working","Not Married"),
				new Friends("Sumit", "25", "bangalore", "Ies college bhopal","Edifecs","working","Not Married"),
				new Friends("Amit", "26", "bangalore", "Ies college bhopal","Edifecs","Not working","Not Married"),
				new Friends("Subham", "27", "bangalore", "Ies college bhopal","Edifecs","Not working","Not Married"));

	}

	@GetMapping("/getUsers")
	public User getUsers(Long userId) {
		return user;
	}

	@PostMapping("/addUsers")
	public String addUsers(@RequestBody User user) {
		this.user = user;
		return "User added successfully";
	}

	@PutMapping("/updateUsers")
	public String updateUsers(@RequestBody User user) {
		this.user = user;
		return "User updated";
	}

	@DeleteMapping("/deletedUsers")
	public String deleteUsers(Long userId) {
		this.user = null;
		return "User deleted";
	}
}
