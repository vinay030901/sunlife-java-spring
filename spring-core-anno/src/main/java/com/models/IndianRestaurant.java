package com.models;

import org.springframework.stereotype.Component;

@Component("ir")
public class IndianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String order) {
		// TODO Auto-generated method stub
		return "preparing " + order + " with lots of spices and herbs";
	}

}
