import java.util.Scanner;

public class C5P1_Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el dni del empleado");
        int dniEmpleado= teclado.nextInt();

        System.out.println("Ingrese el monto correspondiente al sueldo actual del empleado");
        double sueldoEmpleado = teclado.nextDouble();
        double porcentajeAumento;
        double aumento;

        if (sueldoEmpleado <= 20000){
            porcentajeAumento=20;
            aumento=1.20;
        }
        else{
            if(sueldoEmpleado > 20000 && sueldoEmpleado <= 45000){
                porcentajeAumento=10;
                aumento=1.10;
            }
            else{
                porcentajeAumento=5;
                aumento=1.05;
            }
        }

        System.out.println("El porcentaje de aumento correspondiente será del: " + porcentajeAumento + "%");
        System.out.println("El empleado cobrará con el aumento: $" + sueldoEmpleado*aumento);


    }
}
