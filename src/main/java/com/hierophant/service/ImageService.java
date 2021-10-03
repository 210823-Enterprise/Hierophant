package com.hierophant.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Image;
import com.hierophant.repository.ImageDao;

public class ImageService {
	@Autowired
	private ImageDao imgDao;
	
	Logger Log = LoggerFactory.getLogger(this.getClass());
	
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
	public Optional<Image> findById(int img_id)
	{
		try
		{
		return imgDao.findById(img_id);	
		}
		catch(IllegalArgumentException e)
		{
			Log.warn("In ImageService.findById() img_id was invalid. Returning null.");
		}
		return null;
	}
	
}
