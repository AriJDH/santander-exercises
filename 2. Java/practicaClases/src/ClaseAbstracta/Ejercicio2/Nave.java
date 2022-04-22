package ClaseAbstracta.Ejercicio2;

import java.util.ArrayList;

public class Nave implements ICalculable {
    private String nombre;
    private int x;
    private int y;
    private double puntuacion = 0;

    @Override
    public double Calcular(ArrayList a) {
        return 0;
    }

    @Override
    public double Calcular() {
        return 0;
    }

    /*

    @Override
    public double Calcular(ArrayList c) {

        return Math.sqrt(Math.pow(this.x-c.get(0), 2)+Math.pow(this.y-c.get(1),2));

            }

     */


}
