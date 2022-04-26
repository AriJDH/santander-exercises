package C11P2_Ejercicio4.models;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.Period;

public class Calculadora {

    public static String calcularEdad(int dia, int mes,int anio){
        Period edad = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        return String.format("Usted tiene: %d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays());

    }
}
