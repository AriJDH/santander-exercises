package integradores.integradorExcepciones.ejercicioCuatro;

public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("el coseno del angulo es : " + Calculos.calcularCosenoAngulo(20));
        System.out.println("el numero mayor es: " + Calculos.calcularMayorEntreDosNumeros(30, 60));
        System.out.println("el numero menor es: " + Calculos.calcularMenorEntreDosNumeros(30,60));
        System.out.println("la raiz cuadrada es: "+Calculos.calcularRaizCuadrada(4));
        System.out.println("la potencia es: "+Calculos.calcularPotenciaEntreDosNumeros(30,2));
        System.out.println("numero aleatorio obtenido: " + Calculos.obtenerNumeroAleatorio());
    }
}
