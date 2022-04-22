package Ejercicio2;

public class Nave implements Distancias{
    protected String nombre;
    protected double x,y;

    public Nave(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double Distancia(Coordenadas coordenadas) {
        return  Math.pow((Math.pow(x-coordenadas.x,2)+Math.pow(y-coordenadas.y, 2)),0.5f);
    }
}
git