package com.insuranceModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class FamilyFloater implements IRDAI {

	@Value(value="1200.8")
	private double amount;
	
	@Value(value="14")
	private int duration;

	@Override
	public double calculatePremium(int age) {
		return (amount * age * 2) / duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FamilyFloater(double amount, int duration) {
		super();
		this.amount = amount;
		this.duration = duration;
	}

	public FamilyFloater() {
		super();
	}
	
}
