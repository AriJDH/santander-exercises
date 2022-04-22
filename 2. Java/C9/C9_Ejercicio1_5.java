package C9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C9_Ejercicio1_5 {

    public static void main(String[] args) {

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

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);
        listaVehiculos.add(vehiculo3);
        listaVehiculos.add(vehiculo4);
        listaVehiculos.add(vehiculo5);
        listaVehiculos.add(vehiculo6);
        listaVehiculos.add(vehiculo7);
        listaVehiculos.add(vehiculo8);
        listaVehiculos.add(vehiculo9);
        listaVehiculos.add(vehiculo10);
        listaVehiculos.add(vehiculo11);

        Garaje garaje = new Garaje(1,listaVehiculos);

        listaVehiculos.sort((a, b) -> a.costo >= b.costo ? 1 : -1);
        listaVehiculos.sort((a, b) -> a.marca.compareToIgnoreCase(b.marca));

        System.out.println("Vehiculos ordenados por marca y costo");

        listaVehiculos.forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("Vehiculos cuyo costo es menor a 1000");

        (listaVehiculos.stream().filter((vehiculo -> vehiculo.getCosto() < 1000)).
                collect(Collectors.toList())).forEach(System.out::println);;
        System.out.println("--------------------------------------");
        System.out.println("Vehiculos cuyo costo es mayor a 1000");
        (listaVehiculos.stream().filter((vehiculo -> vehiculo.getCosto() >= 1000)).
                collect(Collectors.toList())).forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Costo promedio de los vehículos");

        System.out.printf("$%.2f",listaVehiculos.stream().mapToDouble((vehiculo -> vehiculo.getCosto())).average().getAsDouble());






    }

    public static class Vehiculo{
        String modelo;
        String marca;
        double costo;

        public Vehiculo(String marca, String modelo, double costo) {
            this.modelo = modelo;
            this.marca = marca;
            this.costo = costo;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }

        @Override
        public String toString() {
            return "Vehiculo{" +
                    "modelo='" + modelo + '\'' +
                    ", marca='" + marca + '\'' +
                    ", costo=" + costo +
                    '}';
        }
    }


    public static class Garaje{
        int id;
        List<Vehiculo> listaVehiculo;


        public Garaje(int id, List<Vehiculo> listaVehiculo) {
            this.id = id;
            this.listaVehiculo = listaVehiculo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<Vehiculo> getListaVehiculo() {
            return listaVehiculo;
        }

        public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
            this.listaVehiculo = listaVehiculo;
        }


    }
}
