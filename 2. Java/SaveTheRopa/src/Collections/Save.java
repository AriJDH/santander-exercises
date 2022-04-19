package Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Save {
    public static void main(String[] args){

        Prenda vestido= new Prenda("Gucci", "corto");
        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(vestido);
        GuardaRopa listaDeRopa = new GuardaRopa();
        listaDeRopa.guardarPrendas(prendas);
        listaDeRopa.mostrarPrendas();
        System.out.println(listaDeRopa.devolverPrendas(1));


    }
}