package com.bootcamp.carreraSelva;

import java.util.HashMap;
import java.util.Map;

public class Carrera {

    public static void main(String[] args) {


        Participante p1 = new Participante();
        p1.nombre = "Jorge";
        p1.apellido = "eeass";
        p1.dni = 23312;
        p1.celular = 123123;
        p1.numeroEmergencia = 333333;
        p1.edad = 18;
        p1.grupoSanguineo = "AB";
        Participante p3 = new Participante();
        p3.nombre = "MMMMMMMMMMI";
        p3.apellido = "errrrrrrrrrrrrs";
        p3.dni = 23445;
        p3.celular = 319993;
        p3.numeroEmergencia = 783333;
        p3.edad = 15;
        p3.grupoSanguineo = "O";
        Participante p2 = new Participante();
        p2.nombre = "JoGGD";
        p2.apellido = "aaaaaaaaaaass";
        p2.dni = 23672;
        p2.celular = 126673;
        p2.numeroEmergencia = 344333;
        p2.edad = 20;
        p2.grupoSanguineo = "A";

        Participante p4 = new Participante();
        p4.nombre = "JoGGD";
        p4.apellido = "aaaaaaaaaaass";
        p4.dni = 23672;
        p4.celular = 126673;
        p4.numeroEmergencia = 344333;
        p4.edad = 24;
        p4.grupoSanguineo = "A";

        Participante p5 = new Participante();
        p5.nombre = "JoGGD";
        p5.apellido = "aaaaaaaaaaass";
        p5.dni = 23672;
        p5.celular = 126673;
        p5.numeroEmergencia = 344333;
        p5.edad = 18;
        p5.grupoSanguineo = "A";

        Circuitos crearcircuito = new Circuitos();
        crearcircuito.Inscripcion(1, p1);
        crearcircuito.Inscripcion(1, p2);
        crearcircuito.Inscripcion(3, p3);
        crearcircuito.Inscripcion(2, p4);
        crearcircuito.Inscripcion(2, p5);
        crearcircuito.mostrarCircuito1();
        crearcircuito.mostrarCircuito2();
        crearcircuito.mostrarCircuito3();

        crearcircuito.consultaMonto(3,1);

        crearcircuito.Monto(3);

    }


}
class Participante{
    int dni, edad, celular, numeroEmergencia;
    String nombre, apellido, grupoSanguineo;
}

class Circuitos {
    HashMap<Integer, Participante> circuito1 = new HashMap<>();
    HashMap<Integer, Participante> circuito2 = new HashMap<>();
    HashMap<Integer, Participante> circuito3 = new HashMap<>();

    int cont1 = 1, cont2 = 1, cont3 = 1;

    public Integer Inscripcion(Integer circuito, Participante participante) {
        if (circuito == 1) {
            circuito1.put(cont1, participante);
            cont1++;
        }else if (circuito == 2){
            circuito2.put(cont2, participante);
            cont2++;
        } else if(circuito == 3){
            circuito3.put(cont3, participante);
            cont3++;
        }
        return null;
    }


    public void mostrarCircuito1() {
        System.out.println("La lista de participantes del circuito 1: "
        );
        for (Map.Entry<Integer, Participante> mapa1 : circuito1.entrySet()) {
            System.out.println("Participante " + mapa1.getKey() + ": ");
            System.out.println("Nombre: " + mapa1.getValue().nombre + "; Apellido: " + mapa1.getValue().apellido + "; Dni: " + mapa1.getValue().dni + "; edad: " + mapa1.getValue().edad + "; Grupo Sanguineo: " + mapa1.getValue().grupoSanguineo + "; Celular: " + mapa1.getValue().celular + "; Numero de emergencia: " + mapa1.getValue().numeroEmergencia);
            }
        }

    public void mostrarCircuito2() {
        System.out.println("La lista de participantes del circuito 2: "
        );
        for (Map.Entry<Integer, Participante> mapa2 : circuito2.entrySet()) {
            System.out.println("Participante " + mapa2.getKey() + ": ");
            System.out.println("Nombre: " + mapa2.getValue().nombre + "; Apellido: " + mapa2.getValue().apellido + "; Dni: " + mapa2.getValue().dni + "; edad: " + mapa2.getValue().edad + "; Grupo Sanguineo: " + mapa2.getValue().grupoSanguineo + "; Celular: " + mapa2.getValue().celular + "; Numero de emergencia: " + mapa2.getValue().numeroEmergencia);


        }
    }

    public void mostrarCircuito3() {
        System.out.println("La lista de participantes del circuito 3: "
        );
        for (Map.Entry<Integer, Participante> mapa3 : circuito3.entrySet()) {
            System.out.println("Participante " + mapa3.getKey() + ": ");
            System.out.println("Nombre: " + mapa3.getValue().nombre + "; Apellido: " + mapa3.getValue().apellido + "; Dni: " + mapa3.getValue().dni + "; edad: " + mapa3.getValue().edad + "; Grupo Sanguineo: " + mapa3.getValue().grupoSanguineo + "; Celular: " + mapa3.getValue().celular + "; Numero de emergencia: " + mapa3.getValue().numeroEmergencia);


        }
    }


    public void desinParticipante(Integer circuito, Integer participante) {
        if (circuito == 1) {
            circuito1.remove(participante);
        } else if (circuito == 2) circuito2.remove(participante);
        else if (circuito == 3) {
            circuito3.remove(participante);
        }
    }

    public void consultaMonto(Integer circuito, Integer participante){
        if (circuito ==1) {
            System.out.println("Monto que deberá abonar el participante " + participante + " del circuito "+circuito+" será:");
            if (circuito1.get(participante).edad < 18) {
                System.out.println("Deberá abonar $1300");

            } else {
                System.out.println("Deberá abonar $1500");
            }
        }
        if (circuito ==2) {
            System.out.println("Monto que deberá abonar el participante " + participante + " del circuito"+ circuito+" será:");
            if (circuito2.get(participante).edad < 18) {
                System.out.println("Deberá abonar $2000");

            } else {
                System.out.println("Deberá abonar $2300");
            }
        }
        if (circuito ==3) {
            System.out.println("Monto que deberá abonar el participante " + participante + " del circuito "+ circuito+" será:");
            if (circuito3.get(participante).edad < 18) {
                System.out.println("No se permite participar en este circuito a menores de 18 años");

            } else {
                System.out.println("Deberá abonar $2800");
            }
        }
    }
    public void Monto(Integer circuito){

        int monto1a = 0;
        int monto1b = 0;
        int monto2a = 0;
        int monto2b = 0;
        int monto3 = 0;
        for (Map.Entry<Integer, Participante> mapa1 : circuito1.entrySet()) {
            if (mapa1.getValue().edad < 18) {
                monto1a++;
            } else {
                monto1b++;
            }
            }

        for (Map.Entry<Integer, Participante> mapa2 : circuito2.entrySet()) {
                if (mapa2.getValue().edad < 18){
                    monto2a++;

                }else {
                    monto2b++;
                }

            }
        for (Map.Entry<Integer, Participante> mapa3 : circuito3.entrySet()) {
                if (mapa3.getValue().edad < 18){
                    circuito3.remove(mapa3.getKey());
                }else {
                    monto3++;
                }

            }
        int montoCircuito1 = monto1a*1300 + monto1b*1500;
        int montoCircuito2 = monto2a*2000 + monto2b*2300;
        int montoCircuito3 = monto3*2800;
        int Montototal = montoCircuito1+montoCircuito2+montoCircuito3;

        if (circuito==1){
            System.out.println("El monto del circuito 1 es: $"+ montoCircuito1);
        }else if (circuito==2){
            System.out.println("El monto del circuito 2 es: $"+ montoCircuito2);
        }else if (circuito==3){
            System.out.println("El monto del circuito 3 es: $"+ montoCircuito3);
        }
        System.out.println("El monto total es de: $"+Montototal);
    }





}







