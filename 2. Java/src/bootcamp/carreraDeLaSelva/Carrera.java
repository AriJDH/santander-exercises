package bootcamp.carreraDeLaSelva;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    List<Inscripcion> participantesDelCircuitoChico = new ArrayList<>();
    List<Inscripcion> participantesDelCircuitoMedio = new ArrayList<>();
    List<Inscripcion> participantesDelCircuitoAvanzado = new ArrayList<>();


    public int inscribirParticipante(Participante participante, TipoCircuito tipoCircuito) {
        if(participante.getEdad() < 18 && tipoCircuito.getNombre().equals("Circuito avanzado")){
            System.out.println("No se puede inscribir debido a la edad.");
            return -1;
        }else{

            Inscripcion inscripcion = new Inscripcion();
            inscripcion.inscribirParticipante(participante, tipoCircuito);

            if (tipoCircuito.getNombre().equals("Circuito avanzado")){
                participantesDelCircuitoAvanzado.add(inscripcion);
                return participantesDelCircuitoAvanzado.size();
            }else if(tipoCircuito.getNombre().equals("Circuito medio")){
                participantesDelCircuitoMedio.add(inscripcion);
                return participantesDelCircuitoMedio.size();
            }else{
                participantesDelCircuitoChico.add(inscripcion);
                return participantesDelCircuitoChico.size();
            }
        }
    }

    public void mostrarParticipantesPorCategoria(TipoCircuito tipoCircuito){
        if(tipoCircuito.getNombre().equals("Circuito avanzado")){
            for (Inscripcion inscripcion: participantesDelCircuitoAvanzado) {
                System.out.println(inscripcion.getParticipante().toString());
            }
        }else if(tipoCircuito.getNombre().equals("Circuito medio")){
            for (Inscripcion inscripcion: participantesDelCircuitoMedio) {
                System.out.println(inscripcion.getParticipante().toString());
            }
        }else{
            for (Inscripcion inscripcion: participantesDelCircuitoChico) {
                System.out.println(inscripcion.getParticipante().toString());
            }
        }
    }

    public void desinscribirParticipante(Participante participante){
        if(participante.estaInscripto(this.participantesDelCircuitoChico)){
            participantesDelCircuitoChico.remove(participante.conocerInscripcion(this.participantesDelCircuitoChico));
        }
        if(participante.estaInscripto(this.participantesDelCircuitoMedio)){
            participantesDelCircuitoMedio.remove(participante.conocerInscripcion(this.participantesDelCircuitoMedio));
        }
        if(participante.estaInscripto(this.participantesDelCircuitoAvanzado)){
            participantesDelCircuitoAvanzado.remove(participante.conocerInscripcion(this.participantesDelCircuitoAvanzado));
        }
    }

    public int conocerMontoTarifa(Participante participante) {

        Inscripcion inscripcion = null;

        if(participante.estaInscripto(this.participantesDelCircuitoChico)){
            inscripcion = participante.conocerInscripcion(this.participantesDelCircuitoChico);
        } else if(participante.estaInscripto(this.participantesDelCircuitoMedio)){
            inscripcion = participante.conocerInscripcion(this.participantesDelCircuitoMedio);
        } else if(participante.estaInscripto(this.participantesDelCircuitoAvanzado)){
            inscripcion = participante.conocerInscripcion(this.participantesDelCircuitoAvanzado);
        } else{
            return 0;
        }

        return inscripcion.conocerMontoTarifa(participante);
    }

    public double calcularRecaudacionPorCategoria(TipoCircuito tipoCircuito){
        double recaudacion = 0;

        if(tipoCircuito.getNombre().equals("Circuito avanzado")){
            for (Inscripcion inscripcion: participantesDelCircuitoAvanzado) {
                recaudacion = recaudacion + inscripcion.getTarifa();
            }
        }else if(tipoCircuito.getNombre().equals("Circuito medio")){
            for (Inscripcion inscripcion: participantesDelCircuitoMedio) {
                recaudacion = recaudacion + inscripcion.getTarifa();
            }
        }else{
            for (Inscripcion inscripcion: participantesDelCircuitoChico) {
                recaudacion = recaudacion + inscripcion.getTarifa();
            }
        }

        return recaudacion;
    }
}
