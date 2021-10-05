package com.hierophant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hierophant.model.Post;

@Repository
public interface PostDao extends JpaRepository<Post, Integer>{
	
	// finds the post based on its title 
	public Optional<Post> findByTitle(String postTitle);
	
	// finds the post based on its id
	public Optional<Post> findById(int comId);
	
	// finds all the post from a particular user
//	public List<Post> findByUsername(String userName);
	public List<Post> findByUserId(int userId);
}
