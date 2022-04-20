package C7P2;

public class C7P2_Ejercicio1a {

    public static void main(String[] args) {

        PracticaExcepciones p = new PracticaExcepciones();
        p.calcularCociente();

    }

    public static class PracticaExcepciones{

        private int a=0;
        private int b=300;

        public void calcularCociente(){
            try{
                System.out.println(b/a);
            }
            catch(ArithmeticException e){
                System.out.println("Se ha producido un error");
            }
            finally {
                System.out.println("Programa finalizado");
            }
        }
    }
}
