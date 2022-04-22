package Ejercicio1;

public class Tutor extends Estudiante implements GetClass{
    @Override
    public void Getclass() {
        System.out.println(getClass());
    }

    public Tutor(String nombre, String legajo) {
        super(nombre, legajo);
    }


}
