package com.AirLine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.AirLine.model.AdminSecurity;
import com.AirLine.repository.AdminSecurityRepository;

public class AdminSecurityServiceImplementation  implements AdminSecurityService<AdminSecurity> {

	@Autowired
	AdminSecurityRepository adminSecurityRepository;
	
	@Override
	public boolean save(AdminSecurity e) {

		boolean res=false;
		if(adminSecurityRepository.save(e) != null)
		{
			res=true;
		}
		return res;
	}

	@Override
	public AdminSecurity find(String id) {
		Optional<AdminSecurity> adminInfo = adminSecurityRepository.findById(id);
		return adminInfo.get();
	}

	@Override
	public List<AdminSecurity> findAll() {
		return adminSecurityRepository.findAll();
	}

	@Override
	public boolean update(AdminSecurity e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		adminSecurityRepository.deleteById(id);
		return true;
	}

}
