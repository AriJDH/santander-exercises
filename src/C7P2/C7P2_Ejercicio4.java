package C7P2;

public class C7P2_Ejercicio4 {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 10;
        int num3 = 49;

        System.out.println("El mayor entre: " + num1 + " y " + num2 + " es: " + Calculos.calcularMayor(num1,num2));
        System.out.println("El menor entre: " + num1 + " y " + num2 + " es: " + Calculos.calcularMenor(num1,num2));
        System.out.println("La potencia de: " + num2 + " elevado a la " + num1 + " es: " + Calculos.calcularPotencia(num2,num1));
        System.out.println("El coseno de: " + num2 + " es: " + Calculos.calcularCoseno(num2));
        System.out.println("La raíz cuadrada de: " + num3 + " es: " + Calculos.calcularRaiz(num3));
        System.out.println("Número aleatorio : " + Calculos.devolverRandom());



    }

    public static class Calculos{


        public static int calcularMayor(int num1,int num2){
            return Math.max(num1,num2);
        }

        public static int calcularMenor(int num1,int num2){
            return Math.min(num1,num2);
        }

        public static double calcularPotencia(int num1,int num2){
            return Math.pow(num1,num2);
        }

        public static double calcularCoseno(double num){
            return Math.cos(num);
        }

        public static double calcularRaiz(double num){
            return Math.sqrt(num);
        }

        public static double devolverRandom(){
            return Math.random();

        }


    }
}
