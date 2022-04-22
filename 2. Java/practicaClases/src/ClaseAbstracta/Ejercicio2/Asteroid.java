package ClaseAbstracta.Ejercicio2;

import java.util.ArrayList;

public class Asteroid {
    public static void main(String[] args) {
        ArrayList<Blanco> arrayBlancos = new ArrayList<Blanco>();
        Nave nave1 = new Nave();
        Flota flota1 = new Flota();

        arrayBlancos = Blanco.crear(10);

        for (int i = 0; i < arrayBlancos.size(); i++) {
            //System.out.println(arrayBlancos.get(i));
            arrayBlancos.get(i);
        }

        System.out.printf("3");

    }
}
