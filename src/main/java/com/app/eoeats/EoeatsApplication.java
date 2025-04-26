package com.app.eoeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EoeatsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EoeatsApplication.class);

		// Manually set the port if PORT env variable is present
		Map<String, Object> props = new HashMap<>();
		props.put("server.port", System.getenv("PORT") != null ? System.getenv("PORT") : "8080");
		app.setDefaultProperties(props);

		app.run(args);
	}
}

