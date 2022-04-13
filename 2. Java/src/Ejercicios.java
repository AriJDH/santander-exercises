import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        // Ejercicio 1

        String apellido = "Gomez";  // No necesita corrección

        int edad = 35; // Se debe escribir el número sin comillas

        boolean bandera = false; // Se le debe asignar un nombre a la variable y escribir false sin comillas

        String sueldo = "45857.90"; // En este caso se puede asignar el sueldo como String pero escribiendo
                                    // el número entre comillas o darle un tipo de variable double o float y
                                    // agregarle f al número, además se debe agregar ; al final de la linea

        String nombre = "Julián"; // Se debe cambiar el tipo de variable a String

        // Ejercicio 2

        // En caso del 1nombre, no se puede iniciar el nombre de la variable con un número
        // En caso de $ueldo, no dará ningun error pero por una cuestión de legibilidad y de mejor codigo, se debería cambiar $ por s
        // Al igual que en el caso anterior, se deberia cambiar la @ por a en @pellido
        // Si bien licencia_de_conducir es un nombre válido, como el tipo de variable es boolean a lo mejor quiere dar a entender
        // si tiene o no licencia de conducir, por lo que seria más representativo que se llame tieneLicenciaDeConducir
        // En el caso de la estatura de la persona, el nombre de la variable no puede tener espacios, por lo que se deberia de cambiar los espacios por _


        // Ejercicio 3
        final short precioPorDia = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de dias");
        short cantidadDias = scanner.nextShort();
        System.out.println("El costo total de la campaña será de $" + precioPorDia * cantidadDias);

        // Ejercicio 4
        System.out.println("Ingresar el monto total");
        double montoTotal = scanner.nextDouble();
        System.out.println("El monto en neto aplicando los impuestos es de $" + (montoTotal - (montoTotal * 0.2045)));

    }
}
