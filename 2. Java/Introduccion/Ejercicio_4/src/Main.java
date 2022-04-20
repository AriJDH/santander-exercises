import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto en bruto del premio");

        double premio=scanner.nextInt();

        double impuesto1=(premio*2.45)/100;
        double impuesto2=(premio*15)/100;
        double impuesto3=(premio*3)/100;


        double premioConImpuesto=premio-(impuesto1+impuesto2+impuesto3);

        System.out.println("El premio con los impuestos aplicados es de un total de:\t $"+premioConImpuesto);
    }
}
