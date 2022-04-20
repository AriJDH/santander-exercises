public class Ejercicio1Java {
        public static void main(String[] args) {
                //Ejercicio 4: El programa imprime por pantalla el premio final cuando se ingresa un premio como argumento.

                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese el premio: ");
                int premio = teclado.nextInt();
                teclado.close();
                double impuesto1 = 2.45;
                short impuesto2 = 15;
                short impuesto3 = 3;
                double premioFinal = premio - premio*impuesto1/100 - premio*impuesto2/100 - premio*impuesto3/100;
                System.out.println(premioFinal);
        }
}
