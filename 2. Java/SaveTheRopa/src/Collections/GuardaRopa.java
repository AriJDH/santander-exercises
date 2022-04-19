package Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
//Creo la clase GuardaRopa con los métodos solicitados

public class GuardaRopa {

    int count= 0;
    HashMap<Integer, List>  lista= new HashMap<>();

    //recibe la lista y la añade al Hashmap con una key que viene determinada por el contador previamente inicializado
    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        count++;
        lista.put(count, listaDePrenda);
        return count;
    }
    //Recorro el map para mostrar el identificador y las prendas asociadas (lista de marca y modelo)
    public void mostrarPrendas(){
        lista.forEach((k, v) -> System.out.println("numero: " + k + " prenda: " + v));


    }
    //Devuelvo la prenda solicitada por el cliente a través de su número identificador
    public List<Prenda> devolverPrendas(Integer numero){
        List listaDePrendas = lista.get(numero);
        lista.remove(numero);
        return listaDePrendas;


    }

}
