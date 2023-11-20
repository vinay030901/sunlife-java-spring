package com.example.springcore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class AppConfigure {

	private String url, driverClassName, username, password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Bean
	@Profile("india")
	public String devDBConnect() {
		System.out.println("pname: indian project");
		System.out.println("location: gurgaon");
		System.out.println("no of employees: 600");
		System.out.println("budget: 1 million");
		return "Connected to india env";
	}

	@Bean
	@Profile("canada")
	public String ProdDBConnect() {
		System.out.println("pname: canada project");
		System.out.println("location: toronto");
		System.out.println("no of employees: 9000");
		System.out.println("budget: 1.5 million");
		return "Connected to canada env";
	}

	@Bean
	@Profile("usa")
	public String TestDBConnect() {
		System.out.println("pname: american project");
		System.out.println("location: new york");
		System.out.println("no of employees: 900");
		System.out.println("budget: 2 million");
		return "Connected to usa env";
	}
}
