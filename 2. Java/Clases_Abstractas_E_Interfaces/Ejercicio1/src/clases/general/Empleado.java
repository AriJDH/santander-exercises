package clases.general;

public abstract class Empleado extends Persona{
    protected double salario;

    public Empleado(int legajo, String nombre, String fechaNacimiento, int edad, double salario) {
        super(legajo, nombre, fechaNacimiento, edad);
        this.salario = salario;
    }
    public abstract void laburar();
}
