package Excepciones;

public class PracticaExcepciones {
    public static void main(String[] args) {


    int a = 0;
    int b = 300;
    try{
        double cociente= b/a;

    }catch(ArithmeticException e){
        System.out.println("No se puede dividir por 0");


    }finally {
        System.out.println("programa finalizado");
    }


    }
}
