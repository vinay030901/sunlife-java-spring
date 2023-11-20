package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.models.Restaurant;

@Service("guestservice")
public class GuestServiceImpl implements GuestService {

	@Autowired
	@Qualifier("ar")
	private Restaurant restaurant;

	public GuestServiceImpl(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}

	@Override
	public String orderDining(String food) {
		// TODO Auto-generated method stub
		return restaurant.prepareFood(food);
	}

	public GuestServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
