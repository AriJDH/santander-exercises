package com.santander.calcularPromedioAlumno.services;

import com.santander.calcularPromedioAlumno.dto.AlumnoDTO;
import com.santander.calcularPromedioAlumno.dto.DiplomaDTO;
import org.springframework.stereotype.Service;

@Service
public class ServiceAlumno {

public DiplomaDTO obtenerDiploma(AlumnoDTO alumno){
    DiplomaDTO diploma=new DiplomaDTO();
    double promedio = calcularPromedio(alumno);
    diploma.setPromedio(promedio);
    diploma.setAlumno(alumno);
    diploma.setMensaje(mejorPromedio(promedio));

    return diploma;
}



private String mejorPromedio(double promedio){
    if(promedio>=9){
        return "Felicitaciones";
    }else{
        return "";
    }
}

private double calcularPromedio(AlumnoDTO alumno){
   return alumno.getAsignaturasAprobadas().stream().mapToDouble(value -> value.getNota()).summaryStatistics().getAverage();
}




}
