package com.hierophant.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Comment;
import com.hierophant.model.User;
import com.hierophant.repository.CommentDao;

@Service
public class CommentService {

	
	
	@Autowired
	private CommentDao commentDao;
	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Comment add(Comment comment)
	{
		return comment;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Comment remove(Comment comment)
	{
		return comment;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Comment> findById(int com_id)
	{
		return commentDao.findById(com_id);	
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Comment> findByUserName(String userName)
	{
		return commentDao.findByUsername(userName);	
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Comment> findByUserId(int user_id)
	{
		return commentDao.findByUserId(user_id);	
	}
	
	
}
