package com.hierophant.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Image;
import com.hierophant.repository.ImageDao;

@Service
public class ImageService {
	@Autowired
	private ImageDao imgDao;
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Image add(Image img)
	{
		return img;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Image remove(Image img)
	{
		return img;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Optional<Image> findById(int imgId)
	{
		try
		{
		return imgDao.findById(imgId);	
		}
		catch(IllegalArgumentException e)
		{
			log.warn("In ImageService.findById() imgId was invalid. Returning null.");
		}
		return Optional.empty();
	}
	
}
