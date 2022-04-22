package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.Interface.Iclase;

public class Tutor extends Estudiante implements Iclase {

    public Tutor(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public void darClase() {
        System.out.println("soy el tutor dando clase");
    }
}
