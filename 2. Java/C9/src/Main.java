import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

    public static <Garaje> void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 1000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 1200);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer", 2500);

        Vehiculo vehiculo4 = new Vehiculo("Fiat", "Uno", 500);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos", 1000);
        Vehiculo vehiculo6 = new Vehiculo("Fiat", "Torino", 1250);

        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Aveo", 1250);
        Vehiculo vehiculo8 = new Vehiculo("Chevrolet", "Spin", 2500);

        Vehiculo vehiculo9 = new Vehiculo("Toyota", "Corolla", 1200);
        Vehiculo vehiculo10 = new Vehiculo("Toyota", "Fortuner", 3000);

        Vehiculo vehiculo11 = new Vehiculo("Renault", "Logan", 950);

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);
        vehiculos.add(vehiculo6);
        vehiculos.add(vehiculo7);
        vehiculos.add(vehiculo8);
        vehiculos.add(vehiculo9);
        vehiculos.add(vehiculo10);
        vehiculos.add(vehiculo11);

        Garage garaje = new Garage(1,vehiculos);

        System.out.println("Vehiculos ordenados por marca y costo");

        vehiculos.sort((a,b) -> a.costo >= b.costo ? 1:-1);
        vehiculos.sort((a,b) -> a.marca.compareToIgnoreCase(b.marca));
        vehiculos.forEach(System.out::println);

        System.out.println("Vehiculos con costo menor a 1000");
        (vehiculos.stream().filter((vehiculo -> vehiculo.getCosto()<1000)).
            collect(Collectors.toList())).forEach(System.out::println);

        System.out.println("Vehiculos con costo mayor a 1000");
        (vehiculos.stream().filter((vehiculo -> vehiculo.getCosto()>=1000)).
            collect(Collectors.toList())).forEach(System.out::println);


        double promedio =vehiculos.stream().mapToDouble((vehiculo->vehiculo.getCosto())).average().getAsDouble();

        System.out.printf("%.2f",promedio);
    }
}
