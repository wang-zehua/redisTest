package com.zahua.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration

@RestController
public class HelloController {

	@RequestMapping("/index")
	public String index() {
		return "success";
	}

	@RequestMapping("/getMap")
	public Map<String, Object> getMap() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("errorCode", "200");
		map.put("errorMsg", "300");
		
		return map;
	}
	
	/*
	public static void main(String[] args) {
		
		SpringApplication.run(HelloController.class, args);
		
	}
	*/
}



