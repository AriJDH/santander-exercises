package com.Ejercicio1;

import com.Ejercicio2.ParticipanteCarrera;
import com.Ejercicio2.Tarifa;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Prenda prenda1 = new Prenda("Viamo","Plataformas");
        Prenda prenda2 = new Prenda("Sweet", "Remera");
        ArrayList<Prenda> prendasLista = new ArrayList<Prenda>();
        prendasLista.add(prenda1);
        prendasLista.add(prenda2);
        System.out.println(prendasLista);

        GuardaRopa guarda = new GuardaRopa();
        int guardar1 = guarda.guardarPrendas(prendasLista);
        int guardar2 = guarda.guardarPrendas(prendasLista);
        guarda.mostrarPrendas();
        ArrayList<Prenda> prendasDevueltas = guarda.devolverPrendas(guardar1);
        guarda.mostrarPrendas();

        Tarifa tarifa1 = new Tarifa(1, "tarifaCircChico", 1300, 1500 );
        Tarifa tarifa2 = new Tarifa(2, "tarifaCircMediano", 2000, 2300 );
        Tarifa tarifa3 = new Tarifa(3, "tarifaCircAvanzado", 0,2800 );



        }


        }

