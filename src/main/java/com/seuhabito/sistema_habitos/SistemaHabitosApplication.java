package com.seuhabito.sistema_habitos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.seuhabito.sistema_habitos.model")
@SpringBootApplication
public class SistemaHabitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaHabitosApplication.class, args);
	}

}
