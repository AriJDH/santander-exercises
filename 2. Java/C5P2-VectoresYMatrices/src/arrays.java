import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //EJERCICIO1
        //Consigna
        //cargar una lista de notas por teclado
        //y obtener el promedio de notas
        //crear 3 listas con las notas de los final, aprobados y desaprobados
        //y el promedio de cada lista
        //imprimir por pantalla
        ejercicio1();

        //EJERCICIO2
        //sinn tomar datos por teclado
        //promedio de cada alumno ?
        //imprimir el promedio de cada alumno por pantalla
        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro"};
        int notas[][] = {{4,5,6},{8,9,10},{8,5,10},{3,5,6}};

        int suma = 0, cantidad = 0;
        double promedio = 0;

        for (int i=0; i < alumnos.length; i++) {
            for (int j=0; j < notas[0].length; j++) {
                suma += notas[i][j];
                ++cantidad;
            }
            promedio = suma / cantidad;
            System.out.println("El promedio de "+alumnos[i]+" es de "+ promedio);
        }

    }

    public static void ejercicio1() {
        double [] array_notas = cargar_notas();
        double promedio = obtener_promedio(array_notas);
        System.out.println("El promedio del total de las notas es: " + promedio);

        //divido las notas en tres arrays
        double [] array_aprobados = new double[array_notas.length], array_desaprobados = new double[array_notas.length], array_final = new double[array_notas.length];
        double nota = 0;
        for (int i=0; i<array_notas.length; i++) {
            nota = array_notas[i];
            if ((int)nota < 4) {
                array_desaprobados[i] = nota;
            }
            else{
                if ((int)nota > 4 && (int)nota < 7){
                    array_aprobados[i] = nota;
                }
                else {
                    array_final[i] = nota;
                }
            }
        }
        double prom_desaprobados = obtener_promedio(array_desaprobados);
        double prom_aprobados = obtener_promedio(array_aprobados);
        double prom_final = obtener_promedio(array_final);
        System.out.println("Promedio de desaprobados: " + prom_desaprobados);
        System.out.println("Promedio de aprobados: "+ prom_aprobados);
        System.out.println("Promedio de notas finales: " + prom_final);
    }

    public static double[] cargar_notas() {
        //Creo el array con su respectiva cantidad de notas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        double cantidad = scanner.nextDouble();
        double [] notas = new double[(int)cantidad];
        System.out.println(cantidad);

        for (int i=0; i < cantidad; i++) {
            System.out.print("Ingrese una nota: ");
            double nota = scanner.nextDouble();
            notas[i] = nota;
        }
        return notas;
    }

    public static double obtener_promedio(double [] notas) {
        int contador = 0;
        double suma = 0;
        for (int i=0; i < notas.length; i++ ) {
            suma += notas[i];
            ++contador;
        }
        return suma / contador;
    }

}
