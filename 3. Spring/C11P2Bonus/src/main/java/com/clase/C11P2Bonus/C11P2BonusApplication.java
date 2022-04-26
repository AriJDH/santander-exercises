package com.clase.C11P2Bonus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C11P2BonusApplication implements CommandLineRunner {


	private static final Logger LOGGER = LoggerFactory.getLogger(C11P2BonusApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C11P2BonusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			LOGGER.info("Hola Spring");
	}
}
