package Ejercicio1;

public class Tecnico extends Estudiante implements GetClass{
    @Override
    public void Getclass() {
        System.out.println(getClass());
    }

    public Tecnico(String nombre, String legajo) {
        super(nombre, legajo);
    }
}
