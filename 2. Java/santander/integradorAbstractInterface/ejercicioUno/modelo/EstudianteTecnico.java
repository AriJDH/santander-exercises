package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.modelo;


import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioUno.Interface.IservicioTecnico;

public class EstudianteTecnico extends Estudiante implements IservicioTecnico {
    public EstudianteTecnico(String nombre, String dni) {
        super(nombre, dni);
    }


    @Override
    public void ofrecerServicioTecnico() {
        System.out.println("soy el estudiante tecnico reparando...");
    }
}
