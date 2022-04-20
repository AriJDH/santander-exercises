package estructurasDinamicas;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Prenda unaPrenda= new Prenda("nike", "44");
        Prenda otraPrenda= new Prenda("adidas", "35");
        Prenda otraMasPrenda= new Prenda("puma", "40");
        GuardaRopa guardaRopa = new GuardaRopa();
        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(unaPrenda);
        prendas.add(otraPrenda);
        prendas.add(otraMasPrenda);
        System.out.println("se guardan prendas del 1");
        guardaRopa.guardarPrendas(prendas);

        ArrayList<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(otraPrenda);
        System.out.println("se guardan prendas del 2");
        guardaRopa.guardarPrendas(prendas2);

        ArrayList<Prenda> prendas3 = new ArrayList<>();
        prendas3.add(otraMasPrenda);
        System.out.println("se guardan prendas del 3");
        guardaRopa.guardarPrendas(prendas3);

        System.out.println("Mostramos guardarropas");

        guardaRopa.mostrarPrendas();
        guardaRopa.devolverPrendas(2);
        System.out.println("El numero 2 devuelve prendas");
        System.out.println("Mostramos guardarropas");

        guardaRopa.mostrarPrendas();
    }
}
