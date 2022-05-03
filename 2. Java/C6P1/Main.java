import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prenda prenda1 = new Prenda("Remera", "Lacoste");
        Prenda prenda2 = new Prenda("Pantalon", "Lacoste");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda1);
        prendas.add(prenda2);

        GuardaRopa guardaRopa = new GuardaRopa();

        int codigo = guardaRopa.guardarPrendas(prendas);
        guardaRopa.mostrarPrendas();
        System.out.println(guardaRopa.devolverPrendas(codigo));
    }
}
