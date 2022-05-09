package com.c11p2.demo;

import com.c11p2.demo.dao.Dao;
import com.c11p2.demo.dao.PersonaDao;
import com.c11p2.demo.modelos.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Dao personaDao = new PersonaDao();
	}
}
