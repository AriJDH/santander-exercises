package integradores.integradorExcepciones.ejercicioCuatro;


public class Calculos {

    public static int calcularMayorEntreDosNumeros(int numeroUno, int numeroDos) {
        return Math.max(numeroUno, numeroDos);
    }

    public static int calcularMenorEntreDosNumeros(int numeroUno, int numeroDos) {
        return Math.min(numeroUno, numeroDos);
    }

    public static double calcularPotenciaEntreDosNumeros(int numero, int potencia) {
        return Math.pow(numero, potencia);
    }

    public static double calcularCosenoAngulo(double angulo) {
        double radianes = Math.toRadians(angulo);
        return Math.cos(radianes);
    }

    public static double calcularRaizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static int obtenerNumeroAleatorio() {
        return (int) (Math.random() * 999)+1;
    }


}
