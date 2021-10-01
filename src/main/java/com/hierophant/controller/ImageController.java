package com.hierophant.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hierophant.model.Image;
import com.hierophant.service.ImageService;

@RestController
@RequestMapping("/images")
public class ImageController {

	@Autowired
	ImageService imageService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Image>> findById(@PathVariable("id") int id) {
		return null;
//		return ResponseEntity.ok(imageService.findById(id));
	}
	
	// Later
//	@PostMapping("/create")
//	public ResponseEntity<Image> create(@Valid @RequestBody Image i) {										
//		return ResponseEntity.ok(imageService.insert(i));
//	}
}
