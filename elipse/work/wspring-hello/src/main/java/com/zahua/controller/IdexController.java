package com.zahua.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@EnableAutoConfiguration

@Controller
public class IdexController {

	
	@RequestMapping("/indexController")
	public String index(Map<String, Object>result) {
		result.put("name", "wangzehua110");
		result.put("sex", 1);
		List<String> list=new ArrayList<String>();
		list.add("zhagnsan");
		list.add("lisi");
		result.put("userlist", list);
		return "index";
	}

	/*
	
	public static void main(String[] args) {
		
		SpringApplication.run(IdexController.class, args);
		
	}
	
	*/
}



