package com.lti.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.root.")
@EntityScan("com.lti.root.")
public class FinanceG5Application {
	public static void main(String[] args) {
		SpringApplication.run(FinanceG5Application.class, args);
	}

}
