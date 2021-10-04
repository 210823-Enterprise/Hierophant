package com.hierophant.service;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Comment;
import com.hierophant.repository.CommentDao;

@Service
public class CommentService {

	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CommentDao commentDao;
	
	
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
	public Optional<Comment> findById(int comId)
	{

		try
		{
		return commentDao.findById(comId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In CommentService.findById() com_id was invalid. Returning null.");
		}
		return Optional.empty();

	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Comment> findByUserId(int userId)
	{

		try
		{
		return commentDao.findByUserId(userId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In CommentService.findUserName() userName was invalid. Returning null.");
		}
		return null;
	}
	
	
}
