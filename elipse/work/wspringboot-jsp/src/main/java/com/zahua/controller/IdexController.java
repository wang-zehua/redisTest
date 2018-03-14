package com.zahua.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdexController {

	
	@RequestMapping("/index")
	public String index(Map<String, Object>result) {
		
		return "index";
	}

}



