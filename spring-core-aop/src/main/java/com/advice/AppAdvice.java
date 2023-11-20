package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAdvice {

	@Before("execution(* com.models.Welcome.sayWelcome(..))")
	public void calledBefore() {
		System.out.println("This function is called before.");
	}
	
	@AfterReturning("execution(* com.models.Welcome.sayHi(..))")
	public void calledAfter() {
		System.out.println("This function is called after say Hi.");
	}
}
