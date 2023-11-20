package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insuranceModel.IRDAI;

public class InsuranceService {

	private IRDAI irdai;

	public double premiumValue(int age) {
		return irdai.calculatePremium(age);
	}

	public InsuranceService(IRDAI irdai) {
		super();
		this.irdai = irdai;
	}

	public InsuranceService() {
		super();
		System.out.println("I am in insurance service.");

		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		System.out.println("called after bean gets created.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("called before bean get destroyed.");
	}

}
