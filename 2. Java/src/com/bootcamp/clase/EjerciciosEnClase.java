package com.bootcamp.clase;

public class EjerciciosEnClase {
    public static void main(String[] args) {
        //ejercicio_cargar_notas();
        //ejercicio_matriz_notas();

        EjerciciosCollections ejerciciosCollections = new EjerciciosCollections();
        /*
        ejerciciosCollections.ejercicio_lista_notas_alumnos();
        ejerciciosCollections.ejercicio_array_lists();
         */
        //ejerciciosCollections.sets();
        //ejerciciosCollections.diccionarios();
        ejerciciosCollections.ejercicio_listas_diccionario();

    }

    public static void ejercicio_cargar_notas(){
        final float[] notas = {1,4,6,7,10};
        int reprobados = 0, aprobados = 0, a_final = 0;

        for (float nota : notas) {
            if (nota < 4) {
                reprobados++;
            } else if (nota < 7) {
                a_final++;
            } else {
                aprobados++;
            }
        }

        //
        float[] notas_a_final = new float[a_final];
        float[] notas_aprobados = new float[aprobados];
        float[] notas_reprobados = new float[reprobados];

        float sum_a_final = 0, sum_aprobados = 0, sum_notas_reprobados = 0;
        int indice_a_final = 0, indice_aprobados = 0, indice_reprobados = 0;

        for (float nota : notas) {
            if (nota < 4) {
                notas_reprobados[indice_reprobados] = nota;
                sum_notas_reprobados = sum_aprobados + nota;
                indice_reprobados++;
            } else if (nota < 7) {
                notas_a_final[indice_a_final] = nota;
                sum_a_final = sum_a_final + nota;
                indice_a_final++;
            } else {
                notas_aprobados[indice_aprobados] = nota;
                sum_aprobados = sum_aprobados + nota;
                indice_aprobados++;
            }
        }

        System.out.println("Nota promedio desaprobados: " + sum_notas_reprobados / notas_reprobados.length);
        System.out.println("Nota promedio a final: " + sum_a_final / notas_a_final.length);
        System.out.println("Nota promedio aprobados: " + sum_aprobados / notas_aprobados.length);

    }

    public static void ejercicio_matriz_notas() {
        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro", "Agus"};

        float notas[][] = {{1,2,3},{4,5,6},{3,6,7},{8,4,3},{2,3,4}};

        for (int i_alumno = 0; i_alumno < notas.length; i_alumno++) {
            float promedio_alumno = 0;
            float suma = 0;
            for (int i_nota = 0; i_nota < notas[i_alumno].length; i_nota++) {
                suma += notas[i_alumno][i_nota];
            }
            promedio_alumno = suma / notas[i_alumno].length;
            System.out.println("Promedio del alumno " + alumnos[i_alumno] + " es " + promedio_alumno);
        }

    }
}
