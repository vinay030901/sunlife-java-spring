package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AppDelegate;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	AppDelegate delegate;
//	@PostMapping("/add")
//	public ResponseEntity<Object> addUser(@RequestBody User user) {
//		Integer id = dao.getAllUsers().getUsers().size() + 1;
//		user.setUid(id);
//		dao.addUser(user);
//		return ResponseEntity.ok("User added");
//	}

	@GetMapping("/loadall")
	public String getUser() {
		return delegate.loademp();
	}

	@GetMapping("/loadusers")
	public String loadlogisitics() {
		return delegate.delegateLoadLogisitics();
	}
}
