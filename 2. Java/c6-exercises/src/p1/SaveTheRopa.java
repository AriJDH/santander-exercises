package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Prenda {
    String marca;
    String modelo;

    public Prenda(String marcaRopa, String modeloRopa) {
        marca = marcaRopa;
        modelo = modeloRopa;
    }
}

class GuardaRopa {
    Map<Integer, List<Prenda>> map = new HashMap<>();
    int counter=0;

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        map.put(counter, listaDePrendas);
        counter++;
        return counter-1;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entrada: map.entrySet()) {
            Integer identificador = entrada.getKey();
            List<Prenda> list = entrada.getValue();
            System.out.println("Identificador: " + identificador + ". Prendas: ");
            for (int i=0; i<list.size(); ++i) {
                Prenda p = list.get(i);
                System.out.println("Marca: " + p.marca + ". Modelo: " + p.modelo);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer n) {
        return map.get(n);
    }
}

public class SaveTheRopa {
    public static void main(String[] args) {
        List<Prenda> listDePrendas1 = new ArrayList<>();
        List<Prenda> listDePrendas2 = new ArrayList<>();

        Prenda p1 = new Prenda("Nike", "Buzo");
        Prenda p2 = new Prenda("Adidas", "Remera");
        Prenda p3 = new Prenda("Jordan", "Zapatillas");

        listDePrendas1.add(p1);
        listDePrendas1.add(p2);
        listDePrendas2.add(p3);

        GuardaRopa gr = new GuardaRopa();

        int id1 = gr.guardarPrendas(listDePrendas1);
        int id2 = gr.guardarPrendas(listDePrendas2);

        gr.mostrarPrendas();

        System.out.println("Devoluciones: ");

        List<Prenda> list = gr.devolverPrendas(id1);
        System.out.println("Lista 1: ");
        for(int i=0; i< list.size(); ++i) {
            Prenda p = list.get(i);
            System.out.println("Marca " + p.marca + ". Modelo: " + p.modelo);
        }

        list = gr.devolverPrendas(id2);
        System.out.println("Lista 2: ");
        for(int i=0; i< list.size(); ++i) {
            Prenda p = list.get(i);
            System.out.println("Marca " + p.marca + ". Modelo: " + p.modelo);
        }
    }
}
