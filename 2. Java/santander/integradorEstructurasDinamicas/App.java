package com.santander.practicaListas.integradorEstructurasDinamicas;

public class App {
    public static void main(String[] args) {


        Persona participanteUno = crearParticipante("brian","contrera",27,"343434");
        Persona participanteDos = crearParticipante("pepe","perez",18,"32423566");
        Persona participanteTres = crearParticipante("pepa","lopez",21,"43595434");
        Persona participanteCuatro = crearParticipante("Coco","hernandez",22,"24245666");
        Persona participanteCinco = crearParticipante("leonel","messi",13,"24235455");


        Circuito circuitoChico = new CircuitoChico();
        Circuito circuitoMedio = new CircuitoMedio();
        Circuito circuitoAvanzado = new CircuitoAvanzado();


        circuitoChico.inscribirParticipante(participanteUno);
        circuitoMedio.inscribirParticipante(participanteDos);
        circuitoMedio.inscribirParticipante(participanteTres);
        circuitoAvanzado.inscribirParticipante(participanteCuatro);
        circuitoAvanzado.inscribirParticipante(participanteCinco);

        circuitoChico.mostrarInscriptos();
        circuitoMedio.mostrarInscriptos();
        circuitoAvanzado.mostrarInscriptos();


        System.out.println("el precio recaudado para el circuito chicho es de ");
        circuitoChico.mostrarRecaudado();

        System.out.println("el precio recaudado para el circuito medio es de ");
        circuitoMedio.mostrarRecaudado();

        System.out.println("el precio recaudado para el circuito avanzado es de ");
        circuitoAvanzado.mostrarRecaudado();


        System.out.println("eliminando participante");
        circuitoAvanzado.eliminarParticipante("24245666");
    }


    private static Persona crearParticipante(String nombre,String apellido,int edad,String dni){
        String celular = "1124588999";
        String numeroEmergencia = "1124588999";
        String grupoSanguineo = "0P";
        return new Persona(dni, nombre, apellido, edad, celular, numeroEmergencia, grupoSanguineo);
    }

}
