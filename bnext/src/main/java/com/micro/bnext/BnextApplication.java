package com.micro.bnext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.micro.bnext.model")
@EnableJpaRepositories("com.micro.bnext.repository")
@SpringBootApplication(scanBasePackages = "com.micro.bnext")
public class BnextApplication {

	public static void main(String[] args) {
		SpringApplication.run(BnextApplication.class, args);
	}
}


