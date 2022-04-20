package estructurasDinamicas;
import java.util.List;
import java.util.HashMap;

public class GuardaRopa {
    int count= 0;
    HashMap<Integer, List>  diccionario= new HashMap<>();

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        count++;
        diccionario.put(count, listaDePrenda);
        return count;
    }
    public void mostrarPrendas(){
        diccionario.forEach((n, p) -> System.out.println("numero: " + n + " prenda: " + p));
    }
    public List<Prenda> devolverPrendas(Integer numero){
        return diccionario.remove(numero);
    }
}