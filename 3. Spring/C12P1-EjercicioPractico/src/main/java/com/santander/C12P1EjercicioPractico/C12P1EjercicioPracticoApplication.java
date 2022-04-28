package com.santander.C12P1EjercicioPractico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Se necesita desarrollar un API que recibe un alumno que contiene su “nombre”,
// y todas las asignaturas aprobadas con “nombre” y “nota”, se requiere que se calcule
// el promedio de las notas obtenidas durante la carrera y genere el diploma con un
// “mensaje”, “promedio” y “alumno”.
//En caso que el promedio del alumno supere 9 deberá ser reconocido con una felicitación.

@SpringBootApplication
public class C12P1EjercicioPracticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(C12P1EjercicioPracticoApplication.class, args);
	}

}
