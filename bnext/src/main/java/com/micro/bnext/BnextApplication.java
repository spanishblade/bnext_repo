package com.micro.bnext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan("com.micro.bnext.model")
@EnableJpaRepositories("com.micro.bnext.repository")
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.micro.bnext")
@EnableTransactionManagement
public class BnextApplication {

	public static void main(String[] args) {
		SpringApplication.run(BnextApplication.class, args);
	}
}


