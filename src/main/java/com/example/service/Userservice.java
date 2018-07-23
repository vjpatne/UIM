package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;

@Service
public class Userservice {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findByEmailIgnoreCaseAndPassword(User user) {
		
		try {
		return userRepository.findByEmail(user.getEmail());
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void deletebyuser(User user) {
		
		try {
		userRepository.delete(user);
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
