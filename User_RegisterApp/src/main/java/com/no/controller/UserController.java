package com.no.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.no.model.User;
import com.no.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/AddUser")
	public User AddUser(@RequestBody User user) {
		return userService.saveUser(user);

	}

	@PostMapping("/AddUsers")
	public List<User> AddUsers(@RequestBody List<User> users) {
		return userService.saveUsers(users);

	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userService.getUsers();

	}

	@GetMapping("/users{id}")
	public User findUserById(@PathVariable int id) {
		return userService.getUserById(id);

	}

	@GetMapping("/users{name}")
	public User findUserByName(@PathVariable String name) {
		return userService.getUserByName(name);

	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.saveUser(user);

	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@RequestBody int id) {
		return userService.deleteUser(id);

	}

}//class
