package clases;

public class Participante {
    private String nombre;
    private Composite equipo;
    private int puntaje;

    public Participante(String nombre, Composite equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.puntaje = 0;
    }

    public Composite getEquipo() {
        return equipo;
    }

    public void setEquipo(Composite equipo) {
        this.equipo = equipo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
