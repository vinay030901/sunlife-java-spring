package com.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcore.AppContext;
import com.service.GuestService;

public class Guest {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		GuestService gs = (GuestService) ctx.getBean("guestservice");
		System.out.println(gs.orderDining("dosa"));

	}

}
