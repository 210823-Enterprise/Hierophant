package com.hierophant.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Post;
import com.hierophant.repository.PostDao;

@Service
public class PostService {
	@Autowired
	private PostDao postDao;
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Post add(Post post)
	{
		return post;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Post remove(Post post)
	{
		return post;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Post> findById(int comId)
	{

		try
		{
		return postDao.findById(comId);
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In PostService.findById() com_id was invalid. Returning null.");
		}
		return Optional.empty();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Post> findByUserName(String userName)
	{
		try
		{
		//return postDao.findByUsername(userName);
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In PostService.findByUsername() userName was invalid. Returning null.");
		}
		return null;
		
	}


	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Post> findByUserId(int userId)
	{

		
		try
		{
			return postDao.findByUserId(userId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In PostService.findByUserId() user_id was invalid. Returning null.");
		}
		return null;

	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Post> findByTitle(String postTitle)
	{

		try
		{

			return postDao.findByTitle(postTitle);	

		}
		catch(IllegalArgumentException e)
		{
			log.warn("In PostService.findByTitle() title was invalid. Returning null.");
		}
		return Optional.empty();

	}
}
