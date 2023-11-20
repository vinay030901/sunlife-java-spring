package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/users")
public class AppController {

	@Autowired
	private UserDao dao;

	@PostMapping("/add")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		Integer id = dao.getAllUsers().getUsers().size() + 1;
		user.setUid(id);
		dao.addUser(user);
		return ResponseEntity.ok("User added");
	}

	@GetMapping("/loadusers")
	public Users getUser() {
		return dao.getAllUsers();
	}
}
