package com.hierophant.service;

import java.util.List;
import java.util.Optional;

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
		return postDao.findById(comId);	
	}
	
//	@Transactional(propagation = Propagation.REQUIRES_NEW)
//	public List<Post> findByUserName(String userName)
//	{
//		return postDao.findByUsername(userName);	
//	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Post> findByUserId(int userId)
	{
		return postDao.findByUserId(userId);	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Post> findByTitle(String postTitle)
	{
		return postDao.findByTitle(postTitle);	
	}
}
