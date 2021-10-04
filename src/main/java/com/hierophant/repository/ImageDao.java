package com.hierophant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hierophant.model.Comment;
import com.hierophant.model.Image;

@Repository
public interface ImageDao extends JpaRepository<Image, Integer>{
	
	// finds an image based on its id
	public Optional<Image> findById(int id);
	
	// inserts a image to the database
	public Comment insert(Image image);
			
	// updates a image in the database (edit)
	public boolean update(Image image);
			
	// deletes a image from the database
	public boolean deleteById(int id);
}
