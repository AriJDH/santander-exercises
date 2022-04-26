package com.multiplesParametros.multiplesParametros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplesParametrosApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(MultiplesParametrosApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MultiplesParametrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
