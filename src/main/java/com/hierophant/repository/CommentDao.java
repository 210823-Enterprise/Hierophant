package com.hierophant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hierophant.model.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer> {
	
	// finds a single comment
	public Optional<Comment> findById(int id);
	
	// finds all the comments from a specific user
	public List<Comment> findByUsername(String username);
	public List<Comment> findByUserId(int id);
}
