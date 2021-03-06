package com.restapi.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.springboot.model.User;
import com.restapi.springboot.repository.UserRepository;

@RestController

public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/users")
	public ResponseEntity<List<User>> getUsers() {

		return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("users/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {

		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		return new ResponseEntity(user.get(), HttpStatus.OK);
	}

}
