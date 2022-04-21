package Ejercicio1;

public class Tutor extends Estudiante implements SaberClase{

    public Tutor(String nombre) {
        super(nombre);
    }

    @Override
    public void saberC() {
        System.out.println(getClass());
    }
}
