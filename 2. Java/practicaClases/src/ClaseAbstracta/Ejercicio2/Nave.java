package ClaseAbstracta.Ejercicio2;

public class Nave implements ICalculable {
    private String nombre;
    private int x;
    private int y;
    private int puntuacion = 0;


    @Override
    public double Calcular(int x, int y) {
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
            }


}
