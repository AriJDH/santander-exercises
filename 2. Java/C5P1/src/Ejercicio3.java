import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int clientes;
        int tipoDeServicio;
        int precioFijoMensual = 1500;
        int precioServicioPatrulla = 700;

        System.out.println("Ingrese el numero de cliente:");

        Scanner scanner = new Scanner(System.in);
        clientes = scanner.nextInt();


        while (clientes <= 7) {

            System.out.println("Seleccione --> Servicio 1: Seguridad con camaras");
            System.out.println("Seleccione --> Servicio 2: Seguridad con camaras + Patrullas");
            tipoDeServicio = scanner.nextInt();

            switch (tipoDeServicio){
                case 1:
                    System.out.println("Servicio 1 : Incluye seguridad con camaras 24hs");
                    System.out.println("Cliente n°:" + clientes + " Monto del servicio seleccionado es: $ " +precioFijoMensual);
                    clientes ++;
                    break;
                case 2:
                    System.out.println("Servicio 2 : Incluye seguridad con camaras 24hs + Patrullas");
                    System.out.println("Cliente n°:" + clientes + " Monto del servicio seleccionado es: $ " + (precioFijoMensual + precioServicioPatrulla));
                    clientes ++;
                    break;
            }
        }
    }
}
