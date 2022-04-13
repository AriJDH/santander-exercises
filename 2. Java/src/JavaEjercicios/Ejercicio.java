package JavaEjercicios;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        //verificacion de variables

        String apellido = "Gomez";
        int edad = 35;
        boolean falso = false;
        double sueldo = 45857.90;
        String nombre = "Julián";

        //proponer nombres de variables
        String nombre_estudiante;
        int edad_estudiante;
        double sueldo2;
        String apellido2;
        String direccion;
        boolean licencia_de_conducir;
        double estatura_de_la_persona;
        int cantidad_de_hijos;

        //Community Manager
        final int precio_por_dia = 2;
        System.out.println("Cuantos dias durara la campana?");
        Scanner input = new Scanner(System.in);
        int dias = input.nextInt();

        int precio_final = (precio_por_dia * dias);
        //se imprime el precio total de la campanña
        System.out.println(precio_final);

    }
}
