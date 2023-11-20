package com.models;

import org.springframework.stereotype.Component;

public class WelcomeImpl implements Welcome {

	@Override
	public String sayWelcome(String name) {
		return "welcome " + name + " to AOP";
	}

	public WelcomeImpl() {
		super();
	}

	@Override
	public void sayHi(String name) {
		System.out.println("hi " + name);

	}

}
