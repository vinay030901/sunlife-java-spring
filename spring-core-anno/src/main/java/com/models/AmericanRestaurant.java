package com.models;

import org.springframework.stereotype.Component;

@Component("ar")
public class AmericanRestaurant implements Restaurant {

	@Override
	public String prepareFood(String order) {
		return "preparing " + order + " with lots of cheese and breads";
	}

	public AmericanRestaurant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am in american restaurant service.");

	}
	
}
