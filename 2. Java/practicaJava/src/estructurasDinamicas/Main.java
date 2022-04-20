package estructurasDinamicas;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Prenda unaPrenda= new Prenda("nike", "44");
        Prenda otraPrenda= new Prenda("adidas", "35");
        Prenda otraMasPrenda= new Prenda("puma", "40");
        GuardaRopa listaDeRopa = new GuardaRopa();
        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(unaPrenda);
        prendas.add(otraPrenda);
        prendas.add(otraMasPrenda);
        listaDeRopa.guardarPrendas(prendas);
        listaDeRopa.mostrarPrendas();
    }
}
