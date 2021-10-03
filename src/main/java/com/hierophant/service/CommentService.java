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
import com.hierophant.model.User;
import com.hierophant.repository.CommentDao;

@Service
public class CommentService {

	Logger Log = LoggerFactory.getLogger(this.getClass());
	
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
	public Optional<Comment> findById(int com_id)
	{

		try
		{
		return commentDao.findById(com_id);	
		}
		catch(IllegalArgumentException e)
		{
			Log.warn("In CommentService.findById() com_id was invalid. Returning null.");
		}
		return null;

	}
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	public List<Comment> findByUserName(String userName)
//	{
//		return commentDao.findByUsername(userName);	
//	}
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	public List<Comment> findByUserId(int userId)
//	{
//
//		try
//		{
//		return commentDao.findByUsername(userName);	
//		}
//		catch(IllegalArgumentException e)
//		{
//			Log.warn("In CommentService.findUserName() userName was invalid. Returning null.");
//		}
//		return null;
//	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Comment> findByUserId(int user_id)
	{
		try
		{
		return commentDao.findByUserId(user_id);
		}
		catch(IllegalArgumentException e)
		{
			Log.warn("In CommentService.findByUserId() user_id was invalid. Returning null.");
		}
		return null;

	}
	
	
}
