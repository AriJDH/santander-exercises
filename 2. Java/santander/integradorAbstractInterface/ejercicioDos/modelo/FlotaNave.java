package integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.modelo;


import integradores.integradorExcepciones.integradorAbstractInterface.ejercicioDos.services.IComponente;

import java.util.ArrayList;
import java.util.List;

public class FlotaNave implements IComponente {
    List<IComponente> naves;


    public FlotaNave() {
        this.naves = new ArrayList<>();
    }



    public void agregarNave(Nave nave) {
        naves.add(nave);
    }


    @Override
    public double calcularDistancia() {
        double distancia = 0;

        for (IComponente nave : naves) {
            distancia += nave.calcularDistancia();
        }

        return distancia / naves.size();
    }


}
