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
	public Optional<User> findById(int userId)
	{
		try
		{
			return userDao.findById(userId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In UserService.findById() userId was invalid. Returning empty Optional.");
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
			log.warn("In UserService.findByUserName() userName was invalid. Returning empty Optional.");
		}
		return Optional.empty();
	}
	// adds a user to the database
		public User insert(User user)
		{
			try
			{
				return userDao.insert(user);	
			}
			catch(IllegalArgumentException e)
			{
				log.warn("In UserService.insert() user was invalid. Returning null.");
			}
			return null;
			
		}
		
		// updates user in database
		public boolean update(User user)
		{
			try
			{
				return userDao.update(user);	
			}
			catch(IllegalArgumentException e)
			{
				log.warn("In UserService.update() user was invalid. Returning false.");
			}
			return false;
			
		}
		
		// deletes a user from the database
		public boolean deleteById(int id) 
		{
			try
			{
				return userDao.deleteById(id);	
			}
			catch(IllegalArgumentException e)
			{
				log.warn("In UserService.deleteById() id was invalid. Returning false.");
			}
			return false;
			
		}
	
}
