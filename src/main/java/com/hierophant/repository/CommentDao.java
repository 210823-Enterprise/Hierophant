package com.hierophant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hierophant.model.Comments;

public interface CommentDao extends JpaRepository<Comments, Integer> {
	
	// finds a single comment
	public Optional<Comments> findById(int id);
	
	// finds all the comments from a specific user
	public List<Comments> findByUsername(String username);
	public List<Comments> findByUserId(int id);
}
