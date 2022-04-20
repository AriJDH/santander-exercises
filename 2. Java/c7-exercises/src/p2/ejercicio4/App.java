package p2.ejercicio4;

public class App {
    public static void main(String[] args) {
        System.out.println("Random numbers between 0 and 999");
        for (int i=0; i<10; ++i) {
            System.out.println(Calculos.rand());
        }
    }
}
