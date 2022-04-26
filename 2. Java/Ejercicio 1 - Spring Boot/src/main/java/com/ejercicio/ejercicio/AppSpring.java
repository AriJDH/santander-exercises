package com.ejercicio.ejercicio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpring implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(AppSpring.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
	}
}



