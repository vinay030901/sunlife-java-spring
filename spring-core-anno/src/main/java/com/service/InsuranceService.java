package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insuranceModel.IRDAI;

@Service("service")
public class InsuranceService {

	@Autowired
	@Qualifier("ff")
	private IRDAI irdai;

	public double premiumValue(int age) {
		return irdai.calculatePremium(age);
	}

	public IRDAI getIrdai() {
		return irdai;
	}

	public void setIrdai(IRDAI irdai) {
		this.irdai = irdai;
	}

	public InsuranceService() {
		super();
		System.out.println("I am in insurance service.");

		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("called after bean gets created.");
	}

	public void destroy() {
		System.out.println("called before bean get destroyed.");
	}

}
