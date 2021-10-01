package com.hierophant.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hierophant.model.User;
import com.hierophant.service.UserService;

@RestController // RestController is a specific type of Controller that already assumes you're returning a @ResponseBody
@RequestMapping("/users") // all methods and endpoints exposed at http://localhost:5000/hierophant/users
//@CrossOrigin(origins = "*") // this exposes this controller to all ports, might need config this but for now I will commented out
public class UserController {
	// our controller needs to call its dependency which is our UserService
	@Autowired
	UserService userService;

	// GET request that reads the id from the query parameter
	// ResponseEntity allows us to send back custom HTTP status & headers within the HTTP response
	@GetMapping("/{id}") // if I send a get request to http://localhost:5000/hierophant/users/5, it will capture 5 and search the User table for it
	public ResponseEntity<Optional<User>> findById(@PathVariable("id") int id) {
		// call the service method, pass the capture id through, and return it as
		// response entity with 200 OK status
		return null;
//		return ResponseEntity.ok(userService.findById(id));
	}

	// Create a method that fetches the path variable for finding a user by their username
	@GetMapping("/{username}")
	public ResponseEntity<Optional<User>> findByUsername(@PathVariable("username") String username) {
		return null;
//		return ResponseEntity.ok(userService.findByUsername(username));
	}
	
	// Later
//	@PostMapping("/register") // The Valid annotation makes sure that User must comply with the restriction we set in the model
//	public ResponseEntity<User> register(@Valid @RequestBody User u) { // we're taking in the User object in the HTTP RequestBody						
//		return ResponseEntity.ok(userService.insert(u));
//	}
	
}
