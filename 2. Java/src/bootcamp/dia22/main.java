package bootcamp.dia22;

import java.util.*;
import java.util.stream.Collectors;


public class main {
    public static void main(String[] args) {

        List<Vehiculo> listaVehiculos = new ArrayList<>();

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

        Garaje garaje = new Garaje(1, listaVehiculos);

        System.out.println("Vehiculos sin ordenar.");
        System.out.println(garaje.getVehiculos().toString());
        garaje.getVehiculos().sort((x, y) -> x.getCosto().compareTo(y.getCosto()));
        System.out.println("\n");
        System.out.println("Vehiculos ordenados por precio");
        System.out.println(garaje.getVehiculos().toString());

        System.out.println("\n");
        System.out.println("Vehiculos ordenados por marca y precio");
        garaje.getVehiculos().sort((x, y) -> {
            if(x.getMarca().compareTo(y.getMarca()) == 0){
                return x.getCosto().compareTo(y.getCosto());
            }else{
                return x.getMarca().compareTo(y.getMarca());
            }
        });
        System.out.println(garaje.getVehiculos().toString());


        System.out.println("\n");
        System.out.println("Vehiculos filtrados por precio menor a 1000");
        List<Vehiculo> listaFiltrada = garaje.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() < 1000).collect(Collectors.toList());
        System.out.println(listaFiltrada);


        System.out.println("\n");
        System.out.println("Vehiculos filtrados por precio mayor o igual a 1000");
        listaFiltrada = garaje.getVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() >= 1000).collect(Collectors.toList());
        System.out.println(listaFiltrada);
        
        System.out.println("\n");
        OptionalDouble promedio = garaje.getVehiculos().stream().mapToInt(vehiculo -> vehiculo.getCosto()).average();
        System.out.println("El promedio del costo de los vehiculos es " + promedio.toString());
    }
}
