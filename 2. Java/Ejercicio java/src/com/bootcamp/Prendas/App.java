package com.bootcamp.Prendas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Prenda {
    String marca;
    String modelo;
}

class GuardarRopa {
     HashMap<Integer, List<Prenda>> ropas = new HashMap<>();

     int cont = 0;

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        ropas.put(cont,listaDePrenda);
        cont++;

        return cont-1;//nos devuelve el identificador
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> mapa : ropas.entrySet()) {
            System.out.println("La lista de prendas "+mapa.getKey()+" contiene las prendas: ");
            for (int i = 0; i<mapa.getValue().size() ;i++){
             System.out.println("Marca: "+mapa.getValue().get(i).marca +"; Modelo: "+mapa.getValue().get(i).modelo );
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return ropas.get(numero);
    }
}

public class App {
    public static void main(String[] args) {
        Prenda p1 = new Prenda();
        Prenda p2 = new Prenda();
        p1.marca = "Gucci";
        p1.modelo = "Capo";
        p2.marca = "Supreme";
        p2.modelo = "Drip";


        List<Prenda> prendas = new ArrayList<>();
        GuardarRopa guardado = new GuardarRopa();

        prendas.add(p1);
        prendas.add(p2);

        guardado.guardarPrendas(prendas);
        guardado.guardarPrendas(prendas);
        guardado.mostrarPrendas();



    }
}




