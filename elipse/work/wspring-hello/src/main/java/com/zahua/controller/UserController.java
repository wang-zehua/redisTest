package com.zahua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zehua.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/creatUser")
	public String createUser(String name,Integer age) {
		userService.createUser(name, age);
		return "success";
	}
	
}
