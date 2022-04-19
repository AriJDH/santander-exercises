package bootcamp.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists{
    public static void main(String[] args) {

        List<Integer> notas = new ArrayList<>();
        List<String> alumnos = new ArrayList<>();
        List<String> alumnosPromocionados = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos va a cargar?");
        int cantidadAlumnos = scanner.nextInt();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno");
            String alumno = scanner.nextLine();
            System.out.println(alumno);
            scanner.nextLine();
            System.out.println("Ingrese la nota del alumno");
            notas.add(scanner.nextInt());

            alumnos.add(alumno);
        }

        alumnos.add("Perro");
        System.out.println(alumnos.get(0));
        System.out.println(alumnos.get(1));
        System.out.println(alumnos.get(2));
        for (int i = 0; i < alumnos.size(); i++) {
            if (notas.get(i) > 7){
                alumnosPromocionados.add(alumnos.get(i));
            }
        }

        System.out.println("Los alumnos promocionados son: " + alumnosPromocionados.toString());

    }
}
