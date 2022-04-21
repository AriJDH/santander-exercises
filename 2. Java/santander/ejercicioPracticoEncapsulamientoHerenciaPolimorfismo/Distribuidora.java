package ejercicioPracticoEncapsulamientoHerenciaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

/*
Crear una clase ejecutable llamada Distribuidora, en la misma crear un array de productos,
 imprimir el precio total al
 vender 5 productos de cada tipo. Crear los elementos del array con los datos que quieras.
 */
public class Distribuidora {

    public static void main(String[] args) {
        List<Producto> productos=new ArrayList<>();
        agregarProductos(productos,new Perecedero("Leche", 150, 2));
        agregarProductos(productos,new Perecedero("Queso", 550, 10));
        agregarProductos(productos,new Perecedero("Yogurt", 190, 1));
        agregarProductos(productos,new NoPerecedero("Escoba", 550, "Limpieza"));
        agregarProductos(productos,new NoPerecedero("Aceite", 220, "Vegetal"));

        mostrarMontos(productos);
    }

    private static void agregarProductos(List<Producto> productos,Producto producto){
        productos.add(producto);
    }
    public static void mostrarMontos(List<Producto> productos){
        for (int i = 0; i <productos.size() ; i++) {
            System.out.println(productos.get(i).calcular(5));
        }
    }




}
