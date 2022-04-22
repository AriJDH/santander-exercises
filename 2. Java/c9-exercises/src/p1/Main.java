package p1;

import p1.models.Garage;
import p1.models.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 2
        Garage garage = new Garage();
        Vehiculo v1 = new Vehiculo("Ford", "Fiesta", 1000);
        Vehiculo v2 = new Vehiculo("Fiat", "Uno", 500);
        Vehiculo v3 = new Vehiculo("Chevrolet", "Aveo", 1250);
        Vehiculo v4 = new Vehiculo("Toyota", "Corolla", 1200);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        garage.setVehiculos(vehiculos);

        //Ejercicio 3
        System.out.println("Ejercicio 3");

        Comparator<Vehiculo> byCosto = Comparator.comparing(Vehiculo::getCosto);
        garage.getVehiculos().sort(byCosto);

        garage.getVehiculos().forEach(vehiculo -> System.out.println(vehiculo));

        //Ejercicio 4

        System.out.println("-----------------------------");
        System.out.println("Ejercicio 4");

        Comparator<Vehiculo> byMarca = Comparator.comparing(Vehiculo::getMarca);
        garage.getVehiculos().sort(byMarca.thenComparing(byCosto));

        garage.getVehiculos().forEach(vehiculo -> System.out.println(vehiculo));

        //Ejercicio 5
        System.out.println("-----------------------------");
        System.out.println("Ejercicio 5");

        System.out.println("\nVehículos con costo menor que 1000:");
        List<Vehiculo> vMenorQue1000 = garage.getVehiculos().stream().filter(vehiculo -> vehiculo.getCosto() < 1000).collect(Collectors.toList());
        vMenorQue1000.forEach(vehiculo -> System.out.println(vehiculo));

        System.out.println("\nVehículos con costo mayor o igual que 1000:");
        List<Vehiculo> vMayorQue1000 = garage.getVehiculos().stream().filter(vehiculo -> vehiculo.getCosto() >= 1000).collect(Collectors.toList());;
        vMayorQue1000.forEach(vehiculo -> System.out.println(vehiculo));

        OptionalDouble x = OptionalDouble.of(0);
        x = garage.getVehiculos().stream().mapToInt(y -> y.getCosto()).average();
        System.out.println("\nPromedio de costos: $" + x.getAsDouble());


    }

}
