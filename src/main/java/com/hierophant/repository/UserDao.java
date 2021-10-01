package com.hierophant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hierophant.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	// finds the user based on their username 
	public Optional<User> findByUsername(String username);
	
	// finds the user based on their id
	public Optional<User> findById(int id);
}
