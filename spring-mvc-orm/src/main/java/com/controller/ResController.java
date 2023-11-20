package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.UserDAO;

@Controller
@RequestMapping("/mainapp")
public class ResController {

	@GetMapping("/login")
	public String Login() {
		return "login";
	}

	@GetMapping("/registration")
	public String Registration() {
		return "registration";
	}

	
}
