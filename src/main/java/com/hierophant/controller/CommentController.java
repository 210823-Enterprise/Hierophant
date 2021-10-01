package com.hierophant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hierophant.model.Comments;
import com.hierophant.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Comments>> findById(@PathVariable("id") int id) {
		return null;
//		return ResponseEntity.ok(commentService.findById(id));
	}
	
	@GetMapping("/user/{username}")
	public ResponseEntity<List<Comments>> findByUsername(@PathVariable("username") String username) {
		return null;
//		return ResponseEntity.ok(commentService.findByUsername(username));
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<List<Comments>> findByUserId(@PathVariable("id") int id) {
		return null;
//		return ResponseEntity.ok(commentService.findByUserId(id));
	}
	
	// Later
//	@PostMapping("/create")
//	public ResponseEntity<Comments> create(@Valid @RequestBody Comments c) { 											
//		return ResponseEntity.ok(commentService.insert(c));
//	}
}
