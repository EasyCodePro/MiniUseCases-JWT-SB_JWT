package com.ecp.sbjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SbJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJwtApplication.class, args);
	}

}
