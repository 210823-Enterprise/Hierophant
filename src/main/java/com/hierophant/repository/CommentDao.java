package com.hierophant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Comment;
import com.hierophant.model.Post;

@Repository
@Transactional
public interface CommentDao extends JpaRepository<Comment, Integer> {
	
	// finds a single comment
	public Optional<Comment> findById(int comId);
	
	// finds all the comments from a specific user
//	public List<Comment> findByUsername(String userName);
	public List<Comment> findByUserId(int userId);
	
	// inserts a comment to the database
	public Comment insert(Comment comment);
		
	// updates a comment in the database (edit)
	public boolean update(Comment comment);
		
	// deletes a comment from the database
	public boolean deleteById(int id);
}
