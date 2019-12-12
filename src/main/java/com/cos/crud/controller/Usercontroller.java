package com.cos.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/user/loginForm")
	public String loginFrom() {
		return "/user/loginForm";
	}

	@GetMapping("/user/joinForm")
	public String joinForm() {
		return "/user/joinForm";
	}

	/////////////////////////////// 회원가입//////////////////////////////////
	@PostMapping("/user/join")
	public  String join(User user) {
		ur.join(user);
		return "redirect:/user/loginForm";
	}
	///////////////////////////////////////////////////////////////////////

	////////////////////////////// 로그인 ////////////////////////////////////
	
	@PostMapping("/user/login")
	public String login(User user) {
		// loginForm에서 username과 password가 넘어오는데
		// 이걸 어떻게 DB와 대조해서 로그인 시키는가?
		User u = ur.login(user);
		System.out.println(u);
		if(u !=null) {
			System.out.println("로그인 성공");
			return "redirect:/home"; //rediect는 경로를 반환해준다. 기억해라
		}
		else {
			System.out.println("로그인 실패");
			return"/user/joinForm";
		}
		//////////////////////////////////////////////////////////////////////
	}
}
