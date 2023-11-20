package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDAO;
import com.model.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/logisitics")
public class AppController {

	@Autowired
	private UserDAO us;

	@PostMapping("/login")
	@ResponseBody
	public String LoginValid(@RequestBody User user) {
		if (us.loginValidated(user))
			return "Login Success";
		return "Login Failure";
	}

	@PostMapping("/registration")
	@ResponseBody
	public String RegistrationPost(@RequestBody User user) {
		us.addUser(user);
		return user.toString() + " is added.";
	}

	@GetMapping("/userList")
	public String ListUser() {

		return us.loadAll().toString();
	}

	@GetMapping("/findUser/{uid}")
	@ApiOperation(value = "find details by id", notes = "provide id for the data", response = User.class)
	public String findUser(@PathVariable int uid) {
		return us.searchUser(uid) ? "User Found" : "User not found";
	}

	@DeleteMapping("/deleteUser/{uid}")
	public String deleteUser(@PathVariable int uid) {
		return us.deleteUser(uid);
	}

	@PutMapping("/updateUser/{uid}")
	public String updateUser(@PathVariable int uid, @RequestBody User user) {
		return us.updateUser(uid, user);
	}
}
