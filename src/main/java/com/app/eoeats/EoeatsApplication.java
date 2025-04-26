package com.app.eoeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.app.eoeats.repository")
@EntityScan("com.app.eoeats.model")
public class EoeatsApplication {
	public static void main(String[] args) {
		SpringApplication.run(EoeatsApplication.class, args);
	}
}
