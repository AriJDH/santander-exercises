import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Exlporer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));
        Garage garage = new Garage(1, vehiculos);

        //algunas formas de hacer el sort por el costo
        //garage.getVehiculos().sort(Comparator.comparingInt(x -> x.costo));
        //garage.getVehiculos().sort(Comparator.comparing(Vehiculo::getCosto));
        //garage.getVehiculos().sort((x, y) -> Integer.compare(x.costo, y.costo));


        //sort por marca y modelo
        garage.getVehiculos().sort(Comparator.comparing(Vehiculo::getModelo).thenComparing(Vehiculo::getCosto));

        //filtrar vehiculos por precio
        List<Vehiculo> vehiculosMenoresA1000 = garage.getVehiculos().stream().filter(x -> x.getCosto() <= 1000).collect(Collectors.toList());
        List<Vehiculo> vehiculosMayoresA1000 = garage.getVehiculos().stream().filter(x -> x.getCosto() >= 1000).collect(Collectors.toList());

        //promedio precios vehiculos
        double promedio = garage.getVehiculos().stream().mapToInt(x -> x.costo).average().orElse(0);

        System.out.println(vehiculos.toString());
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println(vehiculosMenoresA1000.toString());
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println(vehiculosMayoresA1000.toString());
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.printf("El promedio de los valores es: %.2f\n", promedio);

    }
}
