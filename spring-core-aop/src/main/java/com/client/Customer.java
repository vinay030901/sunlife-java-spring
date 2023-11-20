package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.context.AppContext;
import com.models.Welcome;
import com.models.WelcomeImpl;

public class Customer {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Welcome is = (Welcome) ctx.getBean("wi");
		System.out.println(is.sayWelcome("Vinay"));
		is.sayHi("Vinay");

		ctx.close();
	}
}
