package com.AirLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AirLine.model.User;
import com.AirLine.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	public UserServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();	}

	@Override
	@Transactional
	public void save(User theUser) {
		
		userRepository.save(theUser);
	}

	@Override
	@Transactional
	public User findById(String username) {
		Optional<User> result = userRepository.findById(username);
		
		User theUser = null;
		
		if (result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find username - " + username);
		}
		
		return theUser;
	}

	@Override
	@Transactional
	public void deleteById(String username) {
		// TODO Auto-generated method stub
		userRepository.deleteById(username);
	}

	
}