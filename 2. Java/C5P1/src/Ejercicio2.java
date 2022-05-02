import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Ingreo por consola los valores de dni y sueldo del empleado
        System.out.println("Ingrese el número de DNI del empleado:");
        Scanner scanner = new Scanner(System.in);
        String dniEmpleado = scanner.nextLine();
        System.out.println("Ingrese el sueldo actual del empleado:");
        double montoSueldo = scanner.nextInt();
        double montoSueldoConAumento;

        //Declaro los condicionales

        if (montoSueldo <= 20000) {
            montoSueldoConAumento = montoSueldo + (montoSueldo * 0.20);
            System.out.println("El empleado con dni:" + dniEmpleado + " posee un aumento del 20%, nuevo impoorte por cobrar es de: $" + montoSueldoConAumento);

        } else if (montoSueldo > 2000 && montoSueldo <= 45000) {

           montoSueldoConAumento = montoSueldo + (montoSueldo * 0.10);
            System.out.println("El empleado con dni:" + dniEmpleado + " posee un aumento del 10%, nuevo impoorte por cobrar es de: $" + montoSueldoConAumento);
        } else {
            {
                montoSueldoConAumento = montoSueldo + (montoSueldo * 0.05);
                System.out.println("El empleado con dni:" + dniEmpleado + " posee un aumento del 5%, nuevo impoorte por cobrar es de: $" + montoSueldoConAumento);

            }
        }







    }
}