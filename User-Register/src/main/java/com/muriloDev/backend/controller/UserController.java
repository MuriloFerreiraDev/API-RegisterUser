package com.muriloDev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muriloDev.backend.dto.UserNameDTO;
import com.muriloDev.backend.model.User;
import com.muriloDev.backend.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User novo = userService.registerUser(user);
		return ResponseEntity.ok(novo);	
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> userL = userService.getAllUsers();
		return ResponseEntity.ok(userL);
	}
	
	@GetMapping("/name")
    public ResponseEntity<List<UserNameDTO>> getAllUserData() {
        return ResponseEntity.ok(userService.getAllUserData());
    }

}
