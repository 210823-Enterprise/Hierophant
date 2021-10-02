package com.hierophant.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.User;
import com.hierophant.repository.UserDao;

public class UserService {
	@Autowired
	private UserDao userDao;
	
	
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
		return userDao.findById(user_id);	
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<User> findByUserName(String userName)
	{
		return userDao.findByUsername(userName);	
	}
	
}
