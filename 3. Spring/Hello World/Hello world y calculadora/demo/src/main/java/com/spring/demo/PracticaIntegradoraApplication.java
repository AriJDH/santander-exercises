package com.spring.demo;

import com.spring.demo.controllers.DAO.DaoPersonaImple;
import com.spring.demo.controllers.DAO.dao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaIntegradoraApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(PracticaIntegradoraApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PracticaIntegradoraApplication.class, args);}
	@Override
	public void run(String... args) throws Exception {
		dao personadao = new DaoPersonaImple();
	}

}
