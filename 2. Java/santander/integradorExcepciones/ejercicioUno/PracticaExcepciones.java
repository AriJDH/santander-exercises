package integradores.integradorExcepciones.ejercicioUno;

public class PracticaExcepciones {
    private int a=0;
    private int b=300;

    public double calcularCociente() throws  IllegalArgumentException{
        if(this.a==0){
            throw  new  IllegalArgumentException("No se puede dividir por 0");
        }
        return this.b/this.a;
    }
}
