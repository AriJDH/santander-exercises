package bootcamp.carreraDeLaSelva;

public class TestCarreraDeLaSelva {
    public static void main(String[] args){
        TipoCircuito circuitoChico = new TipoCircuito("Circuito chico");
        TipoCircuito circuitoMedio = new TipoCircuito("Circuito medio");
        TipoCircuito circuitoAvanzado = new TipoCircuito("Circuito avanzado");

        Carrera carrera = new Carrera();

        Participante participante1 = new Participante("Sanchez", "Federico", 22);
        participante1.setNumeroDeParticipante(carrera.inscribirParticipante(participante1, circuitoChico));

        Participante participante2 = new Participante("asd", "Federico", 12);
        participante2.setNumeroDeParticipante(carrera.inscribirParticipante(participante2, circuitoChico));

        Participante participante3 = new Participante("asd2", "Federico", 18);
        participante3.setNumeroDeParticipante(carrera.inscribirParticipante(participante3, circuitoMedio));

        Participante participante4 = new Participante("asd3", "Federico", 18);
        participante4.setNumeroDeParticipante(carrera.inscribirParticipante(participante4, circuitoAvanzado));

        Participante participante5 = new Participante("asd4", "Federico", 13);
        participante5.setNumeroDeParticipante(carrera.inscribirParticipante(participante5, circuitoAvanzado));

        Participante participante6 = new Participante("asd5", "Federico", 18);
        participante6.setNumeroDeParticipante(carrera.inscribirParticipante(participante6, circuitoChico));

        System.out.println("------------------------------");
        System.out.println("Participantes del circuito chico\n");
        carrera.mostrarParticipantesPorCategoria(circuitoChico);
        carrera.desinscribirParticipante(participante1);

        System.out.println("------------------------------");
        System.out.println("Participantes del circuito chico después de borrar el participante 1\n");
        carrera.mostrarParticipantesPorCategoria(circuitoChico);

        System.out.println("------------------------------");
        System.out.println("Participantes del circuito medio\n");
        carrera.mostrarParticipantesPorCategoria(circuitoMedio);

        System.out.println("------------------------------");
        System.out.println("Participantes del circuito avanzado\n");
        carrera.mostrarParticipantesPorCategoria(circuitoAvanzado);

        System.out.println("------------------------------");
        System.out.println("El participante debera pagar: $" + carrera.conocerMontoTarifa(participante1));
        System.out.println("El participante debera pagar: $" + carrera.conocerMontoTarifa(participante3));

        System.out.println("------------------------------");
        System.out.println("La recaudacion total de la categoria circuito avanzado es: $" + carrera.calcularRecaudacionPorCategoria(circuitoAvanzado));
        System.out.println("La recaudacion total de la categoria circuito medio es: $" + carrera.calcularRecaudacionPorCategoria(circuitoMedio));
        System.out.println("La recaudacion total de la categoria circuito chico es: $" + carrera.calcularRecaudacionPorCategoria(circuitoChico));

    }
}
