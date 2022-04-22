package ej;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos=new ArrayList<>();
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
        Garage g1= new Garage("2",listaVehiculos);
        Comparator<Vehiculo> byMarca = Comparator.comparing(Vehiculo::getMarca);
        Comparator<Vehiculo> byCosto = Comparator.comparing(Vehiculo::getCosto);
        g1.getVehiculos().sort(byMarca.thenComparing(byCosto));
        System.out.println(g1.getVehiculos());
        List<Vehiculo> autosMenoresA1000= g1.getVehiculos().stream().filter((auto)-> (auto.getCosto()<1000)).collect(Collectors.toList());
        List<Vehiculo> autosMayoresIgualesA1000= g1.getVehiculos().stream().filter((auto)-> (auto.getCosto()>=1000)).collect(Collectors.toList());
        autosMenoresA1000.forEach(auto-> System.out.println(auto));
        System.out.println("----");
        autosMayoresIgualesA1000.forEach(auto-> System.out.println(auto));
        System.out.println("----");
        OptionalDouble prom= g1.getVehiculos().stream().mapToInt(x -> (int) x.getCosto()).average();
        System.out.println(prom);
    }
}
