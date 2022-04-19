package collections;

import java.util.*;

public class ejercicioEnClase {
    public static void main(String[] args) {
        List<String> productos = new ArrayList<>(4);
        productos.add("rxl");
        productos.add("rl");
        productos.add("ps");
        productos.add("rxl");

        List<Integer> cantidades = new ArrayList<>(4);
        cantidades.add(10);
        cantidades.add(5);
        cantidades.add(3);
        cantidades.add(13);

        HashMap<String,Integer> mapa = new HashMap<>();

        for (int x = 0; x < productos.size(); x++) {
            mapa.merge(productos.get(x),cantidades.get(x),Integer::sum);
        }

        mapa.forEach((a,b) -> System.out.println(a + ": " + b ));

        /*
        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"uno");
        mapa.put(2,"dos");
        String valor = mapa.get(2);
        System.out.println(valor);
        mapa.remove(2);

         */

        /*
            mapa.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

           */
         /*
        Scanner entrada = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        List<String> nombreAlumnos = new ArrayList<>();
        List<String> nombresAprobados = new ArrayList<>();
        int opcion;
        do {
            System.out.println("ingrese el nombre del alumno: ");
            nombreAlumnos.add(entrada.nextLine());
            System.out.println("ingrese nota del estudiante:");
            notas.add(entrada.nextInt());
            System.out.println("ingrese 0 para finalizar o 1 para continuar ");
            opcion = entrada.nextInt();
            entrada.nextLine();
        } while (opcion != 0);


        for (int i = 0; i <nombreAlumnos.size() ; i++) {
            if(notas.get(i)>=7){
                nombresAprobados.add(nombreAlumnos.get(i));
            }
        }

        for (String nombre:
                nombresAprobados) {
            System.out.println(nombre);
        }
          */







       /* List<String> nombres = new ArrayList<>();

        nombres.add("Maria");
        nombres.add("Maria");
        nombres.add("Maria");

        for (int x=0;x<nombres.size();x++){
            System.out.println(nombres.get(x));
        }

        List<String> nombresLink = new LinkedList<>();
        nombresLink.add("n1");
        nombresLink.add("n1");
        nombresLink.add( 1,"algo");//ayuda en pantalla

        */

    }
}
