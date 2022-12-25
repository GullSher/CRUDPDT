package com.dectwntytwo.decembertwo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dectwntytwo.decembertwo.model.User;
import com.dectwntytwo.decembertwo.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

}
