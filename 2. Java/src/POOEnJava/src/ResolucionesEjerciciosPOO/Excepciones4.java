package ResolucionesEjerciciosPOO;
import java.lang.Math;

public class Excepciones4 {
    public static void main(String[] args) {
        System.out.println(Calculos.mayor(10, 50));
        System.out.println(Calculos.menor(5,3));
        System.out.println(Calculos.potencia(3, 3));
        System.out.println(Calculos.cosAngulo(3.14));
        System.out.println(Calculos.raizCuadrada(4));
        System.out.println(Calculos.numAleatorio());
    }
}

class Calculos {

    public static double mayor(double a, double b) {
        return Math.max(a, b);
    }

    public static double menor(double a, double b) {
        return Math.min(a, b);
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double cosAngulo(double angulo) {
        return Math.cos(angulo);
    }

    public static double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    public static double numAleatorio() {
        return 1000 * Math.random();
    }
}
