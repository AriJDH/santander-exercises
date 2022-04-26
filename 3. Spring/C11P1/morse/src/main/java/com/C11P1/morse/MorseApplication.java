package com.C11P1.morse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MorseApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MorseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
