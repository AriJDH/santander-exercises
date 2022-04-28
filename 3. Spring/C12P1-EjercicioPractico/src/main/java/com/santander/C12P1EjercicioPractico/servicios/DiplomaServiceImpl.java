package com.santander.C12P1EjercicioPractico.servicios;

import com.santander.C12P1EjercicioPractico.controller.Diploma;
import com.santander.C12P1EjercicioPractico.dto.AlumnoDTO;
import com.santander.C12P1EjercicioPractico.dto.DiplomaDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DiplomaServiceImpl implements DiplomaService{

    @Override
    public DiplomaDTO analizar_alumno(AlumnoDTO alumno) {
        DiplomaDTO diploma = new DiplomaDTO();
        diploma.setPromedio(calcular_promedio(alumno)); //guardo el promedio en el atributo del alumno
        diploma.setAlumno(alumno); //guardo al alumno en la diploma
        mensaje_diploma(diploma);

        return null;
    }

    private Double calcular_promedio(AlumnoDTO alumno){
        HashMap<String,Double> materias = alumno.getMaterias_aprobadas();
        Double suma = 0.0;
        for(Double val: materias.values()){
            suma += val;
        }
        return suma / materias.size();
    }

    private String mensaje_diploma(DiplomaDTO diploma){ //tengo los datos del alumno y el promedio en la diploma
        Double promedio = diploma.getPromedio();
        String nombre = diploma.getName();

        String mensaje = nombre+ ", usted ha conseguido el promedio de: "+ promedio;
        if (promedio > 9){
            mensaje = mensaje_con_honores(nombre,promedio);
        }
        return mensaje;
    }

    private String mensaje_con_honores(String nombre, Double promedio) {
        return "¡Felicidades! " + nombre+ ", usted ha conseguido el promedio de: "+ promedio;
    }

}
