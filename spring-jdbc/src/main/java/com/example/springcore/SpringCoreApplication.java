package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;
import com.model.insurance_type;

import com.service.InsuranceService;

@SpringBootApplication
@ComponentScan("com")
public class SpringCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);
		InsuranceService es = (InsuranceService) ctx.getBean("esi");

		Employee emp = new Employee(105, "champ", "australia");
		Insurance ins = new Insurance(105,insurance_type.ACCIDENTAL_INSURANCE, 900000);
		Project pro=new Project(105, 202,"coffee","ground floor");
		es.addInsToEmp(emp, ins);
		es.addProToEmp(emp, pro);
		System.out.println("Insurance assigned to employee.");
		System.out.println("Project assigned to employee.");

	}

}
