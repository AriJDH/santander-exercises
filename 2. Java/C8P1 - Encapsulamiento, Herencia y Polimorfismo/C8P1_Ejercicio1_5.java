package C8P1;

import java.util.ArrayList;
import java.util.List;

public class C8P1_Ejercicio1_5 {

    public static void main(String[] args) {



        Producto p1 = new Perecedero("jamón",110,10);
        Producto p2 = new Perecedero("queso",150,2);
        Producto p3 = new Perecedero("crema",100,1);
        Producto np1 = new NoPerecedero("lentejas",60,"legumbre");
        Producto np2 = new NoPerecedero("porotos",100,"legumbre");

        List<Producto> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(np1);
        lista.add(np2);

        double total=0;
        for (Producto p: lista) {
            System.out.println("Precio original: $" + p.precio);
            total+= p.calcular(5);
            System.out.print("Precio por 5 productos: $");
            System.out.println(p.calcular(5));
            System.out.println(p.toString());

        }
        System.out.println("---------------");
        System.out.println("Total: $" + total);

    }


    public static class Producto{
        protected String nombre;
        protected double precio;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Producto ----> " +
                    " nombre='" + nombre + '\'' +
                    ", precio=" + precio;
        }

        public double calcular( int cantidadDeProductos){
            return cantidadDeProductos*this.precio;
        }
    }


    public static class Perecedero extends Producto{
        private int diasPorCaducar;

        public int getDiasPorCaducar() {
            return diasPorCaducar;
        }

        public void setDiasPorCaducar(int diasPorCaducar) {
            this.diasPorCaducar = diasPorCaducar;
        }

        public Perecedero(String nombre, double precio, int diasPorCaducar) {
            super(nombre, precio);
            this.diasPorCaducar = diasPorCaducar;
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", diasPorCaducar=" + diasPorCaducar;
        }

        public double calcular(int cantidadDeProductos){
            double precioFinal = super.calcular(cantidadDeProductos);
            switch (diasPorCaducar){
                case 1: precioFinal= precioFinal/4;
                break;
                case 2: precioFinal=precioFinal/3;
                break;
                case 3: precioFinal=precioFinal/2;
                break;
            }
            return precioFinal;
        }
    }


    public static class NoPerecedero extends Producto{
        private String tipo;

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public NoPerecedero(String nombre, double precio, String tipo) {
            super(nombre, precio);
            this.tipo = tipo;
        }


        @Override
        public String toString() {
            return super.toString() +
                    ", tipo=" + tipo;
        }

    }
}
