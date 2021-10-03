package com.hierophant.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.User;
import com.hierophant.repository.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User add(User user)
	{
		return user;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User remove(User user)
	{
		return user;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<User> findById(int userId)
	{
		try
		{
			return userDao.findById(userId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In UserService.findById() user_id was invalid. Returning null.");
		}
		return Optional.empty();
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<User> findByUserName(String userName)
	{
		try
		{
			return userDao.findByUsername(userName);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In UserService.findByUsername() userName was invalid. Returning null.");
		}
		return Optional.empty();
	}
	
}
