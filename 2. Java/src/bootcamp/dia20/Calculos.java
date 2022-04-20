package bootcamp.dia20;

public class Calculos {
    public static double cualEsMayor(double a, double b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static double cualEsMenor(double a, double b){
        if(a < b){
            return a;
        }
        return b;
    }

    public static double potenciaDeUnNumero(double numero, int potencia){
        double resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }

    public static double cosenoDeUnAngulo(int angulo){
        return Math.cos(Math.toRadians(angulo));
    }

    public static double raizCuadradaDeUnNumero(int numero){
        return Math.sqrt(numero);
    }

    public static int numeroAleatorio(){
        return (int) Math.random() * 1000;
    }



}
