package com.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrera {

    HashMap<Integer, ArrayList> cChico, cMedio, cAvanzado;
    private int idParticipante;
    private int idCarrera =1;



    public Carrera(){
        this.cChico = new HashMap<>();
        this.cMedio = new HashMap<>();
        this.cAvanzado = new HashMap<>();


    }
    public Integer guardarParticipante(ArrayList<ParticipanteCarrera> participante){
        if(idCarrera == 1){
            cChico.put(idParticipante, participante);
            idParticipante++;
            return idParticipante;
        } else if(idCarrera ==2){
            cMedio.put(idParticipante, participante);
            idParticipante++;
            return idParticipante;

        }else if(idCarrera ==3){
            cAvanzado.put(idParticipante, participante);
            idParticipante++;
            return idParticipante;

        }else{
            System.out.println("La tarifa seleccionada es incorrecta");
        }
        return idParticipante;

    }


}
