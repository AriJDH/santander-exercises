package Ejercicio1;



import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        Producto producto = new Producto("atun", 345);
        Perecedero perecedero = new Perecedero("arroz",120,4);
        NoPerecedero noPerecedero = new NoPerecedero("azucar", 130, "almacen");

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto);
        productos.add(perecedero);
        productos.add(noPerecedero);

        double precioTotal = 0;
        for(Producto p:productos){

            precioTotal += p.calcular(5);
        }


        System.out.println(producto.calcular(2));
        System.out.println(perecedero.calcular(5));
        System.out.println(noPerecedero.calcular(8));
        System.out.println(precioTotal);


    }
}
