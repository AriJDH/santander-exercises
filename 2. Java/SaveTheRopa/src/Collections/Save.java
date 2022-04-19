package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Save {
    public static void main(String[] args){


        Prenda vestido= new Prenda("Gucci", "corto");
        Prenda remera= new Prenda("Zara", "manga larga");
        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(vestido);
        prendas.add(remera);
        GuardaRopa listaDeRopa = new GuardaRopa();
        //devuelvo el codigo de la lista
        int codigo= listaDeRopa.guardarPrendas(prendas);
        //devuelvo las prendas
        System.out.println(listaDeRopa.devolverPrendas(codigo));




    }
}