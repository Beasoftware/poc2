package com.no.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.no.model.User;
import com.no.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	static UserRepository userRepository;

	public User saveUser(User user) {

		return userRepository.save(user);
	}

	public User getUserById(int id) {
		
		
		return userRepository.findById(id).orElse(other: null);
	}

	public User getUserByName(String name) {

		return userRepository.findByName(name);
	}

	public User deleteUser(int id) {

		userRepository.deleteById(id);
		return "user removed !! " + id;
	}

	/*
	 * public User updateUser(User user) {
	 * 
	 * User existinguser=userRepository.findById(user.getTd()).orElse(other: null);
	 * existinguser.setName(user.getName()); existinguser.setemail(user.getEmail());
	 * existinguser.setMobileNo(user.getMobileNo());
	 * existinguser.setDesignation(user.getDesignation());
	 * existinguser.setSalary(user.getSalary());
	 * existinguser.setSalary(user.getSalary()); existinguser.setDOB(user.getDOB());
	 * existinguser.setJoiningdate(user.getJoiningdate()); return
	 * userRepository.save(existinguser);
	 * 
	 * 
	 * }
	 */

	public List<User> saveUsers(List<User> users) {

		return userRepository.saveAll(users);
	}

	public List<User> getUsers() {

		return userRepository.findAll();
	}

}// class
