package com.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.models.WelcomeImpl;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppContext {

	@Bean
	public WelcomeImpl wi() {
		return new WelcomeImpl();
	}
}
