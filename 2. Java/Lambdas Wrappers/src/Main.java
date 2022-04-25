import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        //Instancia y add
        listaVehiculos.add(new Vehiculo("Fiesta", "Ford", 1000));
        listaVehiculos.add(new Vehiculo("Focus", "Ford", 1200));
        listaVehiculos.add(new Vehiculo("Explorer", "Ford", 2500));
        listaVehiculos.add(new Vehiculo("Uno", "Fiat", 500));
        listaVehiculos.add(new Vehiculo("Cronos", "Fiat", 1000));
        listaVehiculos.add(new Vehiculo("Torino", "Fiat", 1250));
        listaVehiculos.add(new Vehiculo("Aveo", "Chevrolet", 1250));
        listaVehiculos.add(new Vehiculo("Spin", "Chevrolet", 2500));
        listaVehiculos.add(new Vehiculo("Corolla", "Toyota", 1200));
        listaVehiculos.add(new Vehiculo("Fortuner", "Toyota", 3000));
        listaVehiculos.add(new Vehiculo("Logan", "Renault", 950));

        Garage garaje = new Garage(1, listaVehiculos);

        //Ordenados por precio
        listaVehiculos.stream().sorted().forEach(System.out::println);

        //Por marca y precio
        Comparator<Vehiculo> comparadorA= (va, vb) -> va.getMarca().compareTo(vb.getMarca());
        Comparator<Vehiculo> comparadorB= comparadorA.thenComparing((va, vb) -> va.getCosto().compareTo(vb.getCosto()));
        listaVehiculos.sort(comparadorB);

        listaVehiculos.forEach(System.out::println);

        //mayores o iguales a 1000
        List<Vehiculo> mayores= listaVehiculos.stream().filter(vehiculo -> vehiculo.getCosto()>=1000).collect(Collectors.toList());
        mayores.forEach(System.out::println);

        //menores o iguales a 1000
        List<Vehiculo> menores= listaVehiculos.stream().filter(vehiculo -> vehiculo.getCosto()<1000).collect(Collectors.toList());
        menores.forEach(System.out::println);

        //Promedio
        IntSummaryStatistics sumaPrecios= listaVehiculos.stream().collect(Collectors.summarizingInt(Vehiculo::getCosto));
        System.out.println("El promedio de precios es de: " + sumaPrecios.getAverage());








    }
}
