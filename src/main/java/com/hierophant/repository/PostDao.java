package com.hierophant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hierophant.model.Post;

public interface PostDao extends JpaRepository<Post, Integer>{
	
	// finds the post based on its title 
	public Optional<Post> findByTitle(String title);
	
	// finds the post based on its id
	public Optional<Post> findById(int id);
	
	// finds all the post from a particular user
	public List<Post> findByUsername(String username);
	public List<Post> findByUserId(int id);
}
