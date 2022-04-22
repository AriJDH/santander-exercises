package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.Interface.Iclase;
import jdk.swing.interop.SwingInterOpUtils;

public class Profesor extends MiembroPersonal implements Iclase {
    public Profesor() {

    }


    @Override
    public void darClase() {
        System.out.println("Enseñando...");
    }
}