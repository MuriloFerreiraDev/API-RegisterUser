package com.muriloDev.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muriloDev.backend.dto.UserNameDTO;
import com.muriloDev.backend.model.User;
import com.muriloDev.backend.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
		 return userRepository.save(user);
	}
	
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public List<UserNameDTO> getAllUserData() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserNameDTO(user.getName(), user.getEmail(),user.getId()))
                .collect(Collectors.toList());
    }

}
