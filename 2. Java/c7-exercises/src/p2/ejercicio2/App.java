package p2.ejercicio2;

public class App {
    public static void main(String[] args) {
        String mensajeFinal = "Este es el último mensaje";
        int[] num = new int[5];

        try {
            num[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println(mensajeFinal);
        }

    }
}
