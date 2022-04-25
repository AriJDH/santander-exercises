package com.santander;

import java.util.LinkedList;
import java.util.List;

public class Inscripcion {
    List<Participante> circuito_chico;
    List<Participante> circuito_medio;
    List<Participante> circuito_avanzado;
    int id;

    public Inscripcion(List<Participante> circuito_chico, List<Participante> circuito_medio, List<Participante> circuito_avanzado, int id) {
        this.circuito_chico = circuito_chico;
        this.circuito_medio = circuito_medio;
        this.circuito_avanzado = circuito_avanzado;
        this.id = id;
    }

    public Inscripcion() {
        this.circuito_chico = new LinkedList<>();
        this.circuito_medio = new LinkedList<>();
        this.circuito_avanzado = new LinkedList<>();
    }

    /*Retorna 0 si el participante se inscribio correctamente y -1 si no. Incluye el pago de la inscripcion según cada caso */
    public void inscribir(Participante participante, int id) {
        int precio = 0;
        int categoria = participante.getCategoria();
        participante.setNum_participante(id);
        switch (categoria){
            case 1:
                CircuitoChico circuitoChico = new CircuitoChico();
                precio = circuitoChico.calcular_precio(participante.getEdad());
                participante.setMonto_a_pagar(precio);
                circuito_chico.add(participante);
                break;
            case 2:
                CircuitoMedio circuitoMedio = new CircuitoMedio();
                precio = circuitoMedio.calcular_precio(participante.getEdad());
                participante.setMonto_a_pagar(precio);
                circuito_medio.add(participante);
                break;
            case 3:
                CircuitoAvanzado circuitoAvanzado = new CircuitoAvanzado();
                precio = circuitoAvanzado.calcular_precio(participante.getEdad());
                participante.setMonto_a_pagar(precio);
                circuito_avanzado.add(participante);
                break;
            default:
                System.out.println("Error! No se pudo realizar la inscripcion");
        }
    }

    public void desinscripcion(Participante participante){
        int categoria = participante.getCategoria();
        switch (categoria){
            case 1:
                circuito_chico.remove(participante);
                break;
            case 2:
                circuito_medio.remove(participante);
                break;
            case 3:
                circuito_avanzado.remove(participante);
                break;
            default:
                System.out.println("Error! No se puede desinscribir al participante.");;
        }
    }

    public int recaudado_por_categoria (int categoria) {
        int monto = 0;
        switch (categoria){
            case 1:
                for (Participante par: this.circuito_chico) {
                    monto += par.getMonto_a_pagar();
                }
                return monto;
            case 2:
                for (Participante par: this.circuito_medio) {
                    monto += par.getMonto_a_pagar();
                }
                return monto;
            case 3:
                for (Participante par: this.circuito_avanzado) {
                    monto += par.getMonto_a_pagar();
                }
                return monto;
            default:
                return -1;
        }

    }

    //GETTERS Y SETTERS
    public List<Participante> getCircuito_chico() {return circuito_chico;}
    public void setCircuito_chico(List<Participante> circuito_chico) {this.circuito_chico = circuito_chico;}

    public List<Participante> getCircuito_medio() {return circuito_medio;}
    public void setCircuito_medio(List<Participante> circuito_medio) {this.circuito_medio = circuito_medio;}

    public List<Participante> getCircuito_avanzado() {return circuito_avanzado;}
    public void setCircuito_avanzado(List<Participante> circuito_avanzado) {this.circuito_avanzado = circuito_avanzado;}

    public int getId() {return id;}
    public void setId(int num_inscripcion) {this.id = id;}


}
