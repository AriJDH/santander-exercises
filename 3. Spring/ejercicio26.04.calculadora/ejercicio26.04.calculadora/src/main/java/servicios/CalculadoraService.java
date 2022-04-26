package servicios;

import com.example.ejercicio264.calculadora.dao.CalculadoraDao;
import com.example.ejercicio264.calculadora.dao.Dao;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraService {

    public static int getEdad(Integer dia, Integer mes, Integer anio){
        return Period.between(LocalDate.of(anio, mes, dia), LocalDate.now()).getYears();
    }



    }

