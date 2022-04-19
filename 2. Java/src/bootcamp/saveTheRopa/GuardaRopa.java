package bootcamp.saveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    HashMap<Integer, List<Prenda>> mapa = new HashMap<>();
    int contador = 0;

    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        this.mapa.put(this.contador, listaDePrendas);
        this.contador++;
        return contador-1;
    }

    public void mostrarPrendas(){
        this.mapa.forEach((k,v) -> System.out.println("Clave: " + k + ", prenda: " + v.toString()));
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return this.mapa.get(numero);
    }

}
