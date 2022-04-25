import java.util.Comparator;

public class ComparadorMarca implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {

        return v1.getMarca().compareTo(v2.getMarca());
    }
}
