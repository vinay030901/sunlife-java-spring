package com.advice;

import javax.annotation.Priority;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AppAdvice2 {

	@Before("execution(* com.models.Welcome.sayWelcome(..))")
	public void calledBefore() {
		System.out.println("This function is called before 2.");
	}

}
