package GenericsWrapperLamdaStream;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(new Vehiculo("Fiesta","Ford",1000));
        vehiculos.add(new Vehiculo("Focus","Ford",1200));
        vehiculos.add(new Vehiculo("Explorer","Ford",1500));
        vehiculos.add(new Vehiculo("Uno","Fiat",500));
        vehiculos.add(new Vehiculo("Cronos","Fiat",500));
        vehiculos.add(new Vehiculo("Torino","Fiat",500));
        vehiculos.add(new Vehiculo("Aveo","Chevrolet",500));
        vehiculos.add(new Vehiculo("Spin","Chevrolet",500));
        vehiculos.add(new Vehiculo("Corolla","Toyota",500));
        vehiculos.add(new Vehiculo("Fortuner","Toyota",500));
        vehiculos.add(new Vehiculo("Logan","Renault",500));


        Garage garage1 = new Garage(1, vehiculos);

    //    System.out.println(garage1.getVehiculos());

    //    vehiculos.sort((v1, v2) -> v1.getCosto() - v2.getCosto());

        System.out.println(garage1.getVehiculos());


        vehiculos.sort((v1, v2) -> {
            if (v1.getMarca().compareTo(v2.getMarca()) == 0) {
                return v1.getModelo().compareTo(v2.getModelo());
            } else {
                return v1.getCosto() - (v2.getCosto());
            }
        });

        System.out.println(garage1.getVehiculos());


       // vehiculos.stream.mapToInt( v1 -> v1.getCosto() > 1000 );



    }
}
