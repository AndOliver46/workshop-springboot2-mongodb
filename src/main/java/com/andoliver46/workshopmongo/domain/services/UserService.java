package com.andoliver46.workshopmongo.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andoliver46.workshopmongo.domain.User;
import com.andoliver46.workshopmongo.domain.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll(); 
	}
}
