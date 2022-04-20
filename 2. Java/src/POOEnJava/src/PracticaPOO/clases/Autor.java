package PracticaPOO.clases;

public class Autor {
    public String nombre;
    public String alias;

    public Autor() {

    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
