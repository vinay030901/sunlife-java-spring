package com.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAdvice {

	@Before("execution(* com.service.InsuranceService.addInsToEmp(..))")
	public void calledBeforeInsurance() {
		System.out.println("Insurance function is called before.");
	}
	
	@Before("execution(* com.service.InsuranceService.addProToEmp(..))")
	public void calledBeforeProjecct() {
		System.out.println("This function is called before project.");
	}
	@AfterReturning("execution(* com.service.InsuranceService.addProToEmp(..))")
	public void calledAfterproject() {
		System.out.println("This function is called after project.");
	}
}
