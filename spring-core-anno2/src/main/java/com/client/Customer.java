package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcore.AppContext;
import com.service.InsuranceService;

public class Customer {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		InsuranceService is = (InsuranceService) ctx.getBean("service");
		System.out.println(is.premiumValue(34));
		ctx.close();
	}
}
