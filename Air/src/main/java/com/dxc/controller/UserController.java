package com.dxc.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.model.Admin;
import com.dxc.model.AdminInfo;
import com.dxc.model.AdminSecurity;
import com.dxc.model.User;
import com.dxc.model.UserInfo;
import com.dxc.model.UserSecurity;
import com.dxc.repository.AdminInfoRepository;
import com.dxc.repository.AdminRepository;
import com.dxc.repository.AdminSecurityRepository;
import com.dxc.repository.UserInfoRepository;
import com.dxc.repository.UserRepository;
import com.dxc.repository.UserSecurityRepository;

@Controller
public class UserController {
	
	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AdminInfoRepository adminInfoRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	AdminSecurityRepository adminSecurityRepository;
	
	@Autowired
	UserSecurityRepository userSecurityRepository;
	
	User user;
	UserInfo userinfo;
	UserSecurity userSecurity;
	Admin admin;
	AdminInfo adminInfo;
	AdminSecurity adminSecurity;
	

	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("register")
	public String addUser() {
		return "register";
	}
		
	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String registerUser(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("gender") String gender,@RequestParam("dob") String dob,@RequestParam("mobile") String mobile,@RequestParam("address") String address,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("question")String question,@RequestParam("answer")String answer) throws ParseException {
		admin = new Admin(id, username, password);
		adminInfo = new AdminInfo(id, name, username, gender, dob, mobile, address);
		adminSecurity = new AdminSecurity(id, username, question, answer);
		user = new User(id, username, password);
		userinfo = new UserInfo(id, name, username, gender, dob, mobile, address);
		userSecurity = new UserSecurity(id, username, question, answer);
		if(username.endsWith("@dxc.com") && adminRepository.save(admin) != null && adminInfoRepository.save(adminInfo) != null && adminSecurityRepository.save(adminSecurity) != null)
		{
			return "login";
		}
		else if(userRepository.save(user)!= null && userInfoRepository.save(userinfo)!= null && userSecurityRepository.save(userSecurity) != null)
		{			
			return "login";
		}
		return "login";
	}

}
