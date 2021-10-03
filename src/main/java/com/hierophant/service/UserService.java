package com.hierophant.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.User;
import com.hierophant.repository.UserDao;

public class UserService {
	@Autowired
	private UserDao userDao;
	
	Logger Log = LoggerFactory.getLogger(this.getClass());
	
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
	public Optional<User> findById(int user_id)
	{
		try
		{
			return userDao.findById(user_id);	
		}
		catch(IllegalArgumentException e)
		{
			Log.warn("In UserService.findById() user_id was invalid. Returning null.");
		}
		return null;
		
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
			Log.warn("In UserService.findByUsername() userName was invalid. Returning null.");
		}
		return null;
	}
	
}
