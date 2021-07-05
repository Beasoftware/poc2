package com.no.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.no.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

	

}
