package com.CarreraDeLaSelva;
import java.util.*;

class Corredores {

    public int dni;
    public String nombre;
    public String apellido;
    public int edad;
    public String celular;
    public String numEmergencia;
    public String grupSang;
    public char tipoCicuito;

    public Corredores(int dniAux, String nombreAux, String apellidoAux, int edadAux, String celularAux, String numEmergenciaAux, String grupSangAux, char tipoCircuitoAux){

        this.dni = dniAux;
        this.nombre = nombreAux;
        this.apellido = apellidoAux;
        this.edad = edadAux;
        this.celular = celularAux;
        this.numEmergencia = numEmergenciaAux;
        this.grupSang = grupSangAux;
        this.tipoCicuito = tipoCircuitoAux;

    }

}

class Circuito {

    public LinkedHashMap<String, List<Corredores>> circuitos = new LinkedHashMap<String, List<Corredores>>();
    public int contador = 0;
    public String idPart;

    public void CargarCorredor (String letraCircuito, List<Corredores>participantes){

        idPart = contador + "-" + letraCircuito;
        circuitos.put(idPart, participantes);
        contador ++;

    }

    public void mostrarCorredor() {

        int i = 0;
        for (String key : circuitos.keySet()) {
            System.out.print("\nN° de corredor: " + key);
            List<Corredores> lista = circuitos.get(key);

            System.out.println("\nNombre: " + lista.get(i).nombre + " " + lista.get(i).apellido+
                    "\nEdad: " + lista.get(i).edad);

            i ++;
        }
        System.out.println("\n--------------------------------------------------");

    }

    public void personasPorCircuito (char circuito) {

        int i = 0;
        for (String key : circuitos.keySet()) {
            List<Corredores> lista = circuitos.get(key);
            if (lista.get(i).tipoCicuito == circuito) {
                System.out.print("\nN° de corredor: " + key +
                        "\nNombre: " + lista.get(i).nombre + " " + lista.get(i).apellido +
                        "\nDNI: " + lista.get(i).dni + "\nCel: " + lista.get(i).celular);
                System.out.println("");
            }
        i ++;
        }
        System.out.println("\n--------------------------------------------------");
    }

}

public class Carrera_de_la_selva {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Corredores> participante = new ArrayList<>();
        Circuito circ = new Circuito();
        boolean bandera = true;
        int dniAuxil, edadAuxil, aPagar, recTotal = 0, recChico = 0, recMedio = 0, recLargo = 0;
        String numPartAuxil = "", nombreAuxil, apellidoAuxil, celularAuxil, numEmergenciaAuxil, grupSangAuxil, letraDeCircuito;
        char tipoCicuitoAuxil, auxBandera = ' ';

        do {
            System.out.println("Cargar Corredor: ");
            System.out.print("Nombre: ");
            nombreAuxil = input.next();
            System.out.print("Apellido: ");
            apellidoAuxil = input.next();
            System.out.print("Edad: ");
            edadAuxil = input.nextInt();
            System.out.print("DNI: ");
            dniAuxil = input.nextInt();
            System.out.print("Celular: ");
            celularAuxil = input.next();
            System.out.print("Num. de emergncia: ");
            numEmergenciaAuxil = input.next();
            System.out.print("Grup. sanguineo: ");
            grupSangAuxil = input.next();
            System.out.print("A que circuito se inscribe (C/M/L): ");
            tipoCicuitoAuxil = input.next().toLowerCase().charAt(0);
            while (tipoCicuitoAuxil != 'c' && tipoCicuitoAuxil != 'm' && tipoCicuitoAuxil != 'l') {
                System.out.println("Le solicitamos que ingrese una opción correcta (C/M/L): ");
                tipoCicuitoAuxil = input.next().toLowerCase().charAt(0);
            }
            while (edadAuxil < 18 && tipoCicuitoAuxil != 'c' && tipoCicuitoAuxil != 'm') {
                System.out.println("No puede ingresar al circuito largo ya que es menor de edad.\nELija otro circuito (C/M): ");
                tipoCicuitoAuxil = input.next().toLowerCase().charAt(0);
            }

            if (tipoCicuitoAuxil == 'c') {
                letraDeCircuito = "C";
                if (edadAuxil < 18) {
                    aPagar = 1300;
                    recChico += aPagar;
                    recTotal += aPagar;
                } else {
                    aPagar = 1500;
                    recChico += aPagar;
                    recTotal += aPagar;
                }
            } else if (tipoCicuitoAuxil == 'm') {
                letraDeCircuito = "M";
                if (edadAuxil < 18) {
                    aPagar = 2000;
                    recMedio += aPagar;
                    recTotal += aPagar;
                } else {
                    aPagar = 2300;
                    recMedio += aPagar;
                    recTotal += aPagar;
                }
            } else {
                letraDeCircuito = "L";
                aPagar = 2800;
                recLargo += aPagar;
                recTotal += aPagar;
            }


            participante.add(new Corredores(dniAuxil, nombreAuxil, apellidoAuxil, edadAuxil, celularAuxil, numEmergenciaAuxil, grupSangAuxil, tipoCicuitoAuxil));
            circ.CargarCorredor(letraDeCircuito, participante);


            for (String key: circ.circuitos.keySet()) {
                System.out.println("\n");
                System.out.println(key);
                System.out.println("\n");
            }


            System.out.println("\nLa persona debe abonar: " + aPagar);
            System.out.println("\n--------------------------------------------------");

            do {
                System.out.println("\nDeséa seguir cargando participantes? (s/n)");
                auxBandera = input.next().toLowerCase().charAt(0);
                if (auxBandera == 'n') {
                    bandera = false;
                }
            } while (auxBandera != 's' && auxBandera != 'n');
            System.out.println("\n--------------------------------------------------");
        } while (bandera);

        circ.mostrarCorredor();
        System.out.println("\nLo recaudado en el circuito chico fue: " + recChico +
                "\nLo recaudado en el circuito medio fue: " + recMedio +
                "\nLo recaudado en el circuito largo fue: " + recLargo +
                "\nEl total recaudado fue: " + recTotal);
        System.out.println("\n--------------------------------------------------");

        circ.personasPorCircuito('c');
        circ.personasPorCircuito('m');
        circ.personasPorCircuito('l');

    }
}
