package com.AirLine.controller;

import java.text.ParseException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.AirLine.model.Admin;
import com.AirLine.model.AdminInfo;
import com.AirLine.model.AdminSecurity;
import com.AirLine.model.User;
import com.AirLine.model.UserInfo;
import com.AirLine.model.UserSecurity;
import com.AirLine.repository.AdminInfoRepository;
import com.AirLine.repository.AdminRepository;
import com.AirLine.repository.AdminSecurityRepository;
import com.AirLine.repository.UserInfoRepository;
import com.AirLine.repository.UserRepository;
import com.AirLine.repository.UserSecurityRepository;

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
	public String registerUser(@RequestParam("name") String name,@RequestParam("gender") String gender,@RequestParam("dob") String dob,@RequestParam("mobile") String mobile,@RequestParam("address") String address,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("question")String question,@RequestParam("answer")String answer) throws ParseException {
		admin = new Admin(username, password);
		adminInfo = new AdminInfo(name, username, gender, dob, mobile, address);
		adminSecurity = new AdminSecurity(username, question, answer);
		user = new User(username, password);
		userinfo = new UserInfo(name, username, gender, dob, mobile, address);
		userSecurity = new UserSecurity(username, question, answer);
		if(username.endsWith("@dxc.com") && adminInfoRepository.save(adminInfo) != null && adminRepository.save(admin) != null &&  adminSecurityRepository.save(adminSecurity) != null)
		{
			return "login";
		}
		else if(userRepository.save(user)!= null && userInfoRepository.save(userinfo)!= null && userSecurityRepository.save(userSecurity) != null)
		{			
			return "login";
		}
		return "login";
	}
	
	@RequestMapping("forget")
	public String forgetpage() {
		return "forget";
	}
	
	@RequestMapping("validate_username")
	public ModelAndView resetpassword(@RequestParam("username") String username){
		ModelAndView modelAndView=new ModelAndView("resetPassword");
		AdminSecurity adminSecurity = adminSecurityRepository.findById(username).orElse(new AdminSecurity());
		modelAndView.addObject("username",adminSecurity.getUsername());
		modelAndView.addObject("question",adminSecurity.getSecurityQuestion());
		return modelAndView;
	}
	
	@RequestMapping("resetPassword")
	public String resetPasswordpage() {
		return "resetPassword";
	}
	
	@RequestMapping(value="validate_question",method=RequestMethod.POST)
	public String validate_question(@RequestParam("username") String username,@RequestParam("question") String question,@RequestParam("answer") String answer){
		ModelAndView modelAndView=new ModelAndView();
		AdminSecurity adminSecurity = adminSecurityRepository.findById(username).orElse(new AdminSecurity());
		if(adminSecurity.getUsername()==username && adminSecurity.getSecurityQuestion() == question && adminSecurity.getAnswer() ==  answer)
		{
			 Admin admin = adminRepository.findById(username).orElse(new Admin());
			 modelAndView.addObject("username",admin.getUsername());
			 //modelAndView.setViewName("ChangePassword");
			 return "ChangePassword";
		}
		
		return "ChangePassword";
	}
	
	@RequestMapping("ChangePassword")
	public String ChangePasswordPage() {
		return "ChangePassword";
	}
	
	@RequestMapping("confirm_password")
	public String ChangePassword(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("cpassword") String cpassword){
		admin = new Admin(username, password);
		user = new User(username, password);
		if(username.endsWith("@dxc.com") && cpassword==password && adminRepository.save(admin)!=null)
		{
			return "login";
		}
		return "login";
	}

}
