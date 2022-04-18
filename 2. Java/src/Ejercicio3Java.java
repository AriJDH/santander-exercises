public class Ejercicio3Java {
    public static void main(String[] args) {
        // Ejercicio 3: Programa que devuelve el costo de la campaña en función de la cantidad de días ingresados.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días: ");
        int dias = teclado.nextInt();
        teclado.close();
        System.out.println(2 * dias);
    }
}