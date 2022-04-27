package com.bootcamp.practicosC12P1;

import com.bootcamp.practicosC12P1.controllers.AlumnoController;
import com.bootcamp.practicosC12P1.dao.ImplementacionDAOAlumnoMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticosC12P1Application implements CommandLineRunner {

	AlumnoController controlador = new AlumnoController();

	public static void main(String[] args) {
		SpringApplication.run(PracticosC12P1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// ImplementacionDAOAlumnoMap dao = new ImplementacionDAOAlumnoMap();
	}
}
