package bootcamp.carreraDeLaSelva;

import java.util.List;

public class Participante {

    String nombre, apellido, grupoSanguineo;
    Integer dni, edad, celular, numeroDeEmergencia, numeroDeParticipante;

    public Participante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numeroDeParticipante=" + numeroDeParticipante +
                '}';
    }

    public void setNumeroDeParticipante (int numeroDeParticipante) {
        this.numeroDeParticipante = numeroDeParticipante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroDeParticipante() {
        return numeroDeParticipante;
    }

    public boolean estaInscripto(List<Inscripcion> inscripciones) {
        for (Inscripcion inscripcion: inscripciones) {
            if(inscripcion.participante == this){
                return true;
            }
        }
        return false;
    }

    public Inscripcion conocerInscripcion(List<Inscripcion> inscripciones) {
        for (Inscripcion inscripcion: inscripciones) {
            if(inscripcion.participante == this){
                return inscripcion;
            }
        }
        return null;
    }
}
