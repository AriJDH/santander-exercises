package C8P2;

public class C8P2_Ejercicio1 {

    public static void main(String[] args) {


    }

    public static abstract class Persona{
        String nombre;
        String apellido;
        int legajo;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getLegajo() {
            return legajo;
        }

        public void setLegajo(int legajo) {
            this.legajo = legajo;
        }

        public Persona(String nombre, String apellido, int legajo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.legajo = legajo;
        }
    }


    public static class Estudiante extends Persona{

        public Estudiante(String nombre, String apellido, int legajo) {
            super(nombre, apellido, legajo);
        }
    }

    public static class Tutores extends  Estudiante{

        String asignatura;

        public Tutores(String nombre, String apellido, int legajo, String asignatura) {
            super(nombre, apellido, legajo);
            this.asignatura = asignatura;
        }
    }

    public static class EstudianteTecnico extends Estudiante{

        public EstudianteTecnico(String nombre, String apellido, int legajo) {
            super(nombre, apellido, legajo);
        }
    }
}
