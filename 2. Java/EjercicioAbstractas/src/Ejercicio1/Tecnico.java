package Ejercicio1;

public class Tecnico extends Estudiante implements SaberClase{

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public void saberC() {
        System.out.println(getClass());
    }
}
