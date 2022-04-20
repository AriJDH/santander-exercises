package Excepciones;

public class Ejercicio4 {
    public static Integer Mayor (int num1, int num2){ return Math.max(num1, num2);}

    public static Integer Menor(int num1, int num2){return Math.min(num1, num2);}

    public static double potencia(double num1, double num2){return Math.pow(num1, num2);}

    public static double coseno(double angulo){return Math.cos(angulo);}

    public static double raiz(double num){return Math.sqrt(num);}

    public  static Integer numAleatorio(){
        double num = Math.random()*1000;
        return (int)num;
    }


}
