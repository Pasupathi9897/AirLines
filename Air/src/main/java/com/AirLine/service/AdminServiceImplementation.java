package com.AirLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirLine.model.Admin;
import com.AirLine.repository.AdminRepository;

@Service
public class AdminServiceImplementation implements AdminService<Admin> {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public boolean save(Admin e) {
		// TODO Auto-generated method stub
		boolean res = false;
		if(res = adminRepository.save(e) != null)
		{
			res = true;
		}
		return res;
	}

	/*@Override
	public boolean update(Admin e) {
		// TODO Auto-generated method stub
		boolean res = false;
		Optional<Admin> adminpresent = adminRepository.findById(e.getId());
		if(adminpresent.isPresent()) {
			res = adminRepository.save(e) != null;
		}
		return res;
	}*/
	
	@Override
	public boolean update(Admin e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin findById(String username) {
		// TODO Auto-generated method stub
		Optional<Admin> res = adminRepository.findById(username);
		return res.get();
	}

	@Override
	public void deleteById(String username) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(username);
	}
	

}
