package ClaseAbstracta.Ejercicio2;

import java.util.ArrayList;

public class Blanco {
    int x;
    int y;

    public Blanco(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ArrayList<Blanco> crear(int i) {
        ArrayList<Blanco> blancos = new ArrayList<Blanco>();
        for (int x=0;x<i;x++){
            Blanco blanco = new Blanco((int)(Math.random() * 11),(int)(Math.random() * 11));
            blancos.add(blanco);

        }

        return blancos;
    }

    @Override
    public String toString() {
        return "Blanco{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
