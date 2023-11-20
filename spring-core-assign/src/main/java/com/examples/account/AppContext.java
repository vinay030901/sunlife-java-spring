package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;

@Configuration
@ComponentScan("com")
public class AppContext {

	@Bean
	public InMemoryAccountRepository ima() {
		return new InMemoryAccountRepository();
	}

	@Bean
	public TransferServiceImpl service() {
		return new TransferServiceImpl(ima());
	}
}
