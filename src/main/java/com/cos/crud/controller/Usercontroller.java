package com.cos.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.crud.model.User;
import com.cos.crud.repository.UserRepository;

@Controller
public class Usercontroller {
	
	@Autowired
	private UserRepository ur;

	@GetMapping("home")
	public String home() {
		return "/index";
	}
	@GetMapping("")
	public String home1() {
		return "/index";
	}
	
	@GetMapping("/user/loginForm")
	public String loginFrom() {
		return "/user/loginForm";
	}
	
	@GetMapping("/user/joinForm")
	public String joinForm() {
		return "/user/joinForm";
	}
	
	///////////////////////////////회원가입//////////////////////////////////
	@PostMapping("/user/join")
	public String join(User user){
		
		try {
			ur.join(user);
			return "redirect:/home";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/home";
	}
	
	@GetMapping("/user/join")
	public @ResponseBody User test(User user) {
		return user;
	}
	
	
}
