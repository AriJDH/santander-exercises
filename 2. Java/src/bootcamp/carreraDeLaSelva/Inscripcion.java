package bootcamp.carreraDeLaSelva;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    TipoCircuito tipoCircuito;
    Participante participante;
    int tarifa;

    public Inscripcion() {
    }

    public void inscribirParticipante(Participante participante, TipoCircuito tipoCircuito) {
            this.setTarifa(tipoCircuito, participante);
            this.tipoCircuito = tipoCircuito;
            this.participante = participante;
    }

    public int conocerMontoTarifa(Participante participante){
        return this.tipoCircuito.getPrecioTarifa(participante);
    }

    public void setTarifa(TipoCircuito tipoCircuito, Participante participante){
        this.tarifa = tipoCircuito.getPrecioTarifa(participante);
    }

    public Participante getParticipante() {
        return this.participante;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                ", participante=" + this.participante.getNombre() + " " + this.participante.getApellido() +
                ", tarifa=" + tarifa +
                '}';
    }

    public double getTarifa() {
        return this.tarifa;
    }
}
