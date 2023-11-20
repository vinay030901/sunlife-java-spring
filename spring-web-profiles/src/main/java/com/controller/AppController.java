package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;

@RestController
@RequestMapping("/app")
public class AppController {

	static int i = 4;
	@Autowired
	private UserDao dao;

	@PostMapping("/add")
	@ResponseBody
	public String addUser(@RequestBody User user) {
		User u = new User(i++, user.getUname(), user.getEmail(), user.getCity());
		dao.addUser(user);
		return "User added";
	}

	@GetMapping("/get")
	@ResponseBody
	public String getUser() {
		return dao.getAllUsers().toString();
	}
}
