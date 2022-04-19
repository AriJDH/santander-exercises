package C6P1;

import java.util.*;

public class C6P1_Ejercicio1 {

    public static void main(String[] args) {

        Prenda p1 = new Prenda("rapsodia","1A");
        Prenda p2 = new Prenda("puma","2B");
        Prenda p3 = new Prenda("checa","10C");
        Prenda p4 = new Prenda("nike","5A");

        List<Prenda> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        List<Prenda> lista2 = new ArrayList<>();
        lista2.add(p3);
        lista2.add(p4);

        GuardaRopa gp = new GuardaRopa();
        int num1 = gp.guardarPrendas(lista1);
        int num2 = gp.guardarPrendas(lista2);

        System.out.println("La primer lista quedo guardada en la clave: " + num1);
        System.out.println("La segunda lista quedo guardada en la clave: " + num2);

        gp.mostrarPrendas();

        System.out.println("El guardarropas tiene: " + gp.mapa.size() + " lista/s guardadas");
        gp.devolverPrendas(1);
        System.out.println("El guardarropas tiene: " + gp.mapa.size() + " lista/s guardadas");







    }

    public static class Prenda{


        private String marca;
        private String modelo;

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }



        public Prenda(String unaMarca,String unModelo){
            marca=unaMarca;
            modelo=unModelo;
        }
    }

    public static class GuardaRopa{

        HashMap<Integer,List<Prenda>> mapa = new HashMap<>();
        int contador=0;

        public Integer guardarPrendas(List<Prenda> listaPrendas){
            mapa.put(contador,listaPrendas);
            int numAsignado= contador;
            contador++;
            return numAsignado;
        }


        public void mostrarPrendas(){

            for(Map.Entry<Integer,List<Prenda>> entrada : mapa.entrySet()){
                Integer clave = entrada.getKey();
                List<Prenda> lista = entrada.getValue();
                System.out.println("Clave: " + clave);
                imprimirPrendas(lista);
            }


        }

        public void imprimirPrendas(List<Prenda> lista){
            System.out.println("Lista de Prendas");
            for (Prenda p: lista) {
                System.out.println("PRENDA ----> Marca: " + p.getMarca() + " - Modelo: " + p.getModelo());
            }
            System.out.println("-----------------------------");

        }

        public List<Prenda> devolverPrendas(Integer clave){
            List<Prenda> lista = mapa.get(clave);
            System.out.println("La siguiente lista es para devolver: ");
            imprimirPrendas(lista);
            mapa.remove(clave);
            return lista;

        }
    }



}
