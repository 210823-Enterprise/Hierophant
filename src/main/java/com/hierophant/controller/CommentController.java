package com.hierophant.controller;

import java.util.List;
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

import com.hierophant.model.Comment;
import com.hierophant.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Comment>> findById(@PathVariable("id") int comId) {
		return ResponseEntity.ok(commentService.findById(comId));
	}
	
//	@GetMapping("/user/{username}")
//	public ResponseEntity<List<Comment>> findByUserName(@PathVariable("username") String userName) {
//		// return null;
//		return ResponseEntity.ok(commentService.findByUserName(userName));
//	}

	@GetMapping("/user/{id}")
	public ResponseEntity<List<Comment>> findByUserId(@PathVariable("id") int userId) {
		return ResponseEntity.ok(commentService.findByUserId(userId));
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Comment> insert(@Valid @RequestBody Comment c) { 											
		return ResponseEntity.ok(commentService.insert(c));
	}
	
	@PatchMapping("/update")
	public ResponseEntity<Boolean> update(@Valid @RequestBody Comment c) { 											
		return ResponseEntity.ok(commentService.update(c));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("id") int id) { 											
		return ResponseEntity.ok(commentService.deleteById(id));
	}
}
