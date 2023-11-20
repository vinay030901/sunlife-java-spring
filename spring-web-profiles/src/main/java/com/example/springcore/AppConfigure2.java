//package com.example.springcore;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//@Configuration
//@ConfigurationProperties("spring.datasource")
//public class AppConfigure2 {
//
//	private String url, driverClassName, username, password;
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getDriverClassName() {
//		return driverClassName;
//	}
//
//	public void setDriverClassName(String driverClassName) {
//		this.driverClassName = driverClassName;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Bean
//	@Profile("dev")
//	public String devDBConnect() {
//		System.out.println(driverClassName);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
//		return "Connected to dev env";
//	}
//
//	@Bean
//	@Profile("prod")
//	public String ProdDBConnect() {
//		System.out.println(driverClassName);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
//		return "Connected to prod env";
//	}
//
//	@Bean
//	@Profile("test")
//	public String TestDBConnect() {
//		System.out.println(driverClassName);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
//		return "Connected to test env";
//	}
//}
