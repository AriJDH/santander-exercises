package p2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Counter count = new Counter();
        Circuits circuits = new Circuits();
        int option, circuit, dni;
        while(true) {
            System.out.println("1. Ingresar un nuevo participante\n" +
                                "2. Mostrar inscriptos a una categoría\n" +
                                "3. Desinscribir un participante\n" +
                                "4. Calcular monto total recaudado\n" +
                                "5. Salir\n" +
                                "Opción: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese el dni");
                    dni = input.nextInt();
                    System.out.println("Ingrese el nombre");
                    String name = input.next();
                    System.out.println("Ingrese el apellido");
                    String lastName = input.next();
                    System.out.println("Ingrese el edad");
                    int age = input.nextInt();
                    System.out.println("Ingrese el celular");
                    int telNumber = input.nextInt();
                    System.out.println("Ingrese un número de emergencia");
                    int emergencyNumber = input.nextInt();
                    System.out.println("Ingrese el grupo sanguineo");
                    String bloodType = input.next();

                    System.out.println("Ingrese el circuito: (1. Chico, 2. Medio, 3. Avanzado)");
                    circuit = input.nextInt();

                    if (age < 18 && circuit == 3) {
                        System.out.println("No se permite la inscripción de menores de 18 años al" +
                                            "circuito avanzado.");
                        System.out.println("---------------------------------");
                        continue;
                    }

                    Participante p = new Participante(count.getCount(), dni, name, lastName, age,
                                            telNumber, emergencyNumber, bloodType, circuit);

                    circuits.addParticipant(circuit, p);

                    System.out.println("Costo de inscripcion: $" + circuits.amountToPay(p));
                    count.increment();
                    break;

                case 2:
                    System.out.println("Ingrese el circuito: (1. Chico, 2. Medio, 3. Avanzado)");
                    circuit = input.nextInt();
                    circuits.showParticipants(circuit);
                    break;

                case 3:
                    System.out.println("Ingrese el dni del participante");
                    dni = input.nextInt();
                    circuits.delParticipant(dni);
                    break;

                case 4:
                    System.out.println("Monto recaudado por circuito chico: " + circuits.getRevenue(1));
                    System.out.println("Monto recaudado por circuito medio: " + circuits.getRevenue(2));
                    System.out.println("Monto recaudado por circuito avanzado: " + circuits.getRevenue(3));
                    System.out.println("Monto recaudado total: " + (circuits.getRevenue(1) +
                            circuits.getRevenue(2) + circuits.getRevenue(3)));
                    break;
                case 5:
                    return;
            }
            System.out.println("---------------------------------");
        }
    }
}


