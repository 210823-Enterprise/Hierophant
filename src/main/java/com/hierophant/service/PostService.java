package com.hierophant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Post;
import com.hierophant.repository.PostDao;

public class PostService {
	@Autowired
	private PostDao postDao;
	
	
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
	public Optional<Post> findById(int com_id)
	{
		return postDao.findById(com_id);	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Post> findByUserName(String userName)
	{
		return postDao.findByUsername(userName);	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Post> findByUserId(int user_id)
	{
		return postDao.findByUserId(user_id);	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Post> findByTitle(String title)
	{
		return postDao.findByTitle(title);	
	}
}
