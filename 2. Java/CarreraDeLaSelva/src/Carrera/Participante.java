package Carrera;

public class Participante {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int numeroEmergencia;
    private String grupoSanguineo;

    public Participante(int dni, String nombre, String apellido, int edad, int celular, int numeroEmergencia,
                        String grupoSanguineo){
        this.dni= dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.celular= celular;
        this.numeroEmergencia= numeroEmergencia;
        this.grupoSanguineo= grupoSanguineo;

    }



}
