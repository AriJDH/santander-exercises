package C7P2;

public class C7P2_Ejercicio1b {

    public static void main(String[] args) {

        PracticaExcepciones p = new PracticaExcepciones();
        p.calcularCociente();

    }

    public static class PracticaExcepciones{

        private int a=0;
        private int b=300;

        public void calcularCociente(){
            try{
                if(a == 0)
                    throw new IllegalArgumentException("No se puede dividir por cero");
            }
            catch(IllegalArgumentException e){
                e.printStackTrace();
            }
        }
    }
}
