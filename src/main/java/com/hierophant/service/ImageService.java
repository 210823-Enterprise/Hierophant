package com.hierophant.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hierophant.model.Image;
import com.hierophant.repository.ImageDao;

public class ImageService {
	@Autowired
	private ImageDao imgDao;
	
	
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
		return imgDao.findById(img_id);	
	}
	
}
