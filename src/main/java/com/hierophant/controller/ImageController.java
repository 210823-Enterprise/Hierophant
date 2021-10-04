package com.hierophant.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return ResponseEntity.ok(imageService.findById(id));
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Image> insert(@Valid @RequestBody Image i) {										
		return ResponseEntity.ok(imageService.insert(i));
	}
	
	@PatchMapping("/update")
	public ResponseEntity<Boolean> update(@Valid @RequestBody Image i) {										
		return ResponseEntity.ok(imageService.update(i));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("id") int id) {										
		return ResponseEntity.ok(imageService.deleteById(id));
	}
}
