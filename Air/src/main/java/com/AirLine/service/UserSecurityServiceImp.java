package com.AirLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.AirLine.model.UserSecurity;
import com.AirLine.repository.UserSecurityRepository;

@Service
public class UserSecurityServiceImp implements IUserSecurityService {
	
	@Autowired
	UserSecurityRepository repo;

	@Override
	public UserSecurity add(UserSecurity security) {
		
		return repo.save(security);
	}

	@Override
	public UserSecurity findById(String username) {
		Optional<UserSecurity> users = repo.findById(username);
		return users.get();
	}

	@Override
	public List<UserSecurity> findAll() {
		// TODO Auto-generated method stub
		return (List<UserSecurity>) repo.findAll();
	}

	@Override
	public boolean update(UserSecurity e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(String username) {
		// TODO Auto-generated method stub
		repo.deleteById(username);
		
	}

}
