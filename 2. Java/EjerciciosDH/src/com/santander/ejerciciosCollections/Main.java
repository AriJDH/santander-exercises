package com.santander.ejerciciosCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cond=1;

        Participante p1 = new Participante(1,"35854790", "Salvia", 31, "1141756277", "42448138", "A+",1500);
        Participante p2 = new Participante(2,"33695748", "Iacono", 39, "1154682481", "42928475", "A-",2300);
        Participante p3 = new Participante(3,"31857954", "Salvia", 31, "1149687541", "42963258", "AB+",2800);

        LinkedList<Participante> participantesCC = new LinkedList<>();
        LinkedList<Participante> participantesCM = new LinkedList<>();
        LinkedList<Participante> participantesCA = new LinkedList<>();
        participantesCC.add(p1);
        participantesCM.add(p2);
        participantesCA.add(p3);

        Scanner input = new Scanner(System.in);

        //Variables intermedias de carga.
        int participante_categoria;
        String participante_dni;
        String participante_apellido;
        int participante_edad;
        String participante_nCelular;
        String participante_nEmergencias;
        String participante_gSanguineo;
        int participante_aporte;

        //Proceso de carga:

        do {
            System.out.println("Ingrese la categoria donde quiere inscribir al participante [C.Chico=1][C.Medio=2][C.Avanzado=3]:");
            participante_categoria = input.nextInt();
            System.out.println("Ingrese el DNI del participante:");
            participante_dni = input.next();
            System.out.println("Ingrese el apellido del participante:");
            participante_apellido = input.next();
            System.out.println("Ingrese la edad del participante:");
            participante_edad = input.nextInt();
            System.out.println("Ingrese el numero de celular del participante:");
            participante_nCelular = input.next();
            System.out.println("Ingrese el numero de emergencias del participante:");
            participante_nEmergencias = input.next();
            System.out.println("Ingrese el grupo sanguineo del participante:");
            participante_gSanguineo = input.next();
            if (participante_categoria==1){
                if(participante_edad<18){
                    participante_aporte=1300;
                } else{
                    participante_aporte=1500;
                }
                participantesCC.add(new Participante(participante_categoria,participante_dni,participante_apellido,participante_edad,participante_nCelular,participante_nEmergencias,participante_gSanguineo,participante_aporte));
            }
            if (participante_categoria==2){
                if(participante_edad<18){
                    participante_aporte=2000;
                } else{
                    participante_aporte=2300;
                }
                participantesCM.add(new Participante(participante_categoria,participante_dni,participante_apellido,participante_edad,participante_nCelular,participante_nEmergencias,participante_gSanguineo,participante_aporte));
            }
            if (participante_categoria==3){
                if(participante_edad<18){
                    System.out.println("El participante es menor de edad y no puede competir en esta categoria.");
                    break;
                } else{
                    participante_aporte=2800;
                    participantesCA.add(new Participante(participante_categoria,participante_dni,participante_apellido,participante_edad,participante_nCelular,participante_nEmergencias,participante_gSanguineo,participante_aporte));
                }
            }

            System.out.println("¿Desea cargar un nuevo participante? [Si=1][No=0]");
            cond= input.nextInt();
        } while (cond!=0);
        System.out.println("------------------------------------------------------Circuito Chico-------------------------------------------------------");
        for (Participante participante : participantesCC) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("------------------------------------------------------Circuito Medio-------------------------------------------------------");
        for (Participante participante : participantesCM) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------Circuito Avanzado-----------------------------------------------------");
        for (Participante participante : participantesCA) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese la categoria donde desea eliminar un participante:");
        int nCat = input.nextInt();
        System.out.println("Elimino el Participante, ingresando la posicion que ocupa en la lista:");
        int nRemove = input.nextInt()-1;
        switch (nCat){
            case 1:participantesCC.remove(nRemove);
                break;
            case 2:participantesCM.remove(nRemove);
                break;
            case 3:participantesCA.remove(nRemove);
                break;
            default:
                System.out.println("La categoria ingresada no existe!");
        }
        System.out.println("------------------------------------------------------Circuito Chico-------------------------------------------------------");
        for (Participante participante : participantesCC) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("------------------------------------------------------Circuito Medio-------------------------------------------------------");
        for (Participante participante : participantesCM) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("-----------------------------------------------------Circuito Avanzado-----------------------------------------------------");
        for (Participante participante : participantesCA) {
            System.out.println("Insc N°:"+participante.getIdParticipante()+" Apellido: "+participante.getApellido()+" DNI:"+participante.getDni()+" Edad:"+participante.getEdad()+" Cel:"+participante.getnCelular()+" Tel Emergencias:"+participante.getnEmergencias()+" Grupo Sanguineo:"+participante.getgSanguineo()+" Aporte:$"+participante.getAporte());
        }
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        float acumulado1=0;
        float acumulado2=0;
        float acumulado3=0;
        for (Participante participante : participantesCC) {
            acumulado1+=participante.getAporte();
        }
        for (Participante participante : participantesCM) {
            acumulado2+=participante.getAporte();
        }
        for (Participante participante : participantesCA) {
            acumulado3+=participante.getAporte();
        }

        System.out.println("---------------------------------------------------------Finanzas----------------------------------------------------------");
        System.out.println("Los aportes de cada una de las categorias son:");
        System.out.println("-Circuito Chico:    $"+acumulado1);
        System.out.println("-Circuito Medio:    $"+acumulado2);
        System.out.println("-Circuito Avanzado: $"+acumulado3);
        System.out.println("                    --------");
        System.out.println("      Aporte total: $"+(acumulado1+acumulado2+acumulado3));
    }
}
