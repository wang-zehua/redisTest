package com.zehua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createUser(String name, Integer age) {
		String insertUserSQL = "insert into users values(null,?,?);";
		jdbcTemplate.update(insertUserSQL, name, age);
		System.out.println("tianjiachenggong");
	}

}
