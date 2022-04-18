import java.util.Scanner;

public class Estructuras_Condicionales_y_Repetitivas {
    public static void main(String[] args) {
        int num = 8;
        if (num > 8) {
            System.out.println("El número es mayor que 8");
        } else {
            if (num < 8) {
                System.out.println("El número es menor que 8");
            } else {
                System.out.println("El número es igual a 8");
            }
        }
        //Consigna
        //Ingresar 3 notas de calificaciones (double)
        //Conseguir el promedio y devolver:
        //1-4 recursa, 4-7 va a final, 7-10 promociona
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        double nota1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        double nota2 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        double nota3 = teclado.nextInt();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es :" + promedio);
        if (promedio < 4) {
            System.out.println("Recursa");
        } else {
            if (promedio < 7) {
                System.out.println("Va a final");
            } else {
                System.out.println("Promociona");
            }
        }
        //Consigna, reemplazar estructura condicional con switch:
        System.out.println("Ingrese la primera nota: ");
        double nota4 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        double nota5 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        double nota6 = teclado.nextInt();
        int promedio2 = (int) ((nota4 + nota5 + nota6) / 3);
        System.out.println("El promedio es :" + promedio2);
        switch (promedio2) {
            case 1:
            case 2:
            case 3:
                System.out.println("Recursa");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Va a final");
                break;
            default:
                System.out.println("Promociona");
        }
        //Estruturas repetitivas:
        int numero = 0;
        do {
            System.out.println("Número" + numero);
            numero++;
        } while (numero < 6);
        numero = 0;
        while (numero < 6) {
            System.out.println("Número" + numero);
            numero++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Número" + i);
        }
    }
}

