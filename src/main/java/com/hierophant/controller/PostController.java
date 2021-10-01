package com.hierophant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hierophant.model.Post;
import com.hierophant.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	@Autowired
	PostService postService;
	
	@GetMapping("/{title}")
	public ResponseEntity<Optional<Post>> findByTitle(@PathVariable("title") String title) {
		return null;
//		return ResponseEntity.ok(postService.findByTitle(title));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Post>> findById(@PathVariable("id") int id) {
		return null;
//		return ResponseEntity.ok(postService.findById(id));
	}
	
	@GetMapping("/user/{username}")
	public ResponseEntity<List<Post>> findByUsername(@PathVariable("username") String username) {
		return null;
//		return ResponseEntity.ok(postService.findByUsername(username));
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<List<Post>> findByUserId(@PathVariable("id") int id) {
		return null;
//		return ResponseEntity.ok(postService.findById(id));
	}
	
	// Later
//	@PostMapping("/create")
//	public ResponseEntity<Post> create(@Valid @RequestBody Post p) { 											
//		return ResponseEntity.ok(postService.insert(p));
//	}
}
