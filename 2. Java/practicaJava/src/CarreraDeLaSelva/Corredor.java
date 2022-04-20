package CarreraDeLaSelva;


public class Corredor {
    private Integer dni;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer celular;
    private Integer numeroEmergencia;
    private String GrupoSanguineo;
    private Integer inscripto;
    private Double pago;


    public Corredor(Integer dni, String nombre, String apellido, Integer edad, Integer celular, Integer numeroEmergencia, String grupoSanguineo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.GrupoSanguineo = grupoSanguineo;

    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numeroEmergencia=" + numeroEmergencia +
                ", GrupoSanguineo='" + GrupoSanguineo + '\'' +
                ", inscripto=" + inscripto +
                ", pago=" + pago +
                '}';
    }
}

