package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.modelo;

import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.Interface.IservicioTecnico;

public class PersonalSoporteTecnico extends MiembroPersonal implements IservicioTecnico {
    public PersonalSoporteTecnico() {

    }


    @Override
    public void ofrecerServicioTecnico() {
        System.out.println("reparando...");
    }
}