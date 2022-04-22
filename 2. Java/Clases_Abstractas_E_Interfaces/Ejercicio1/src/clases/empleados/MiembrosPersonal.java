package clases.empleados;

import clases.general.Empleado;

public abstract class MiembrosPersonal extends Empleado {

    public MiembrosPersonal(int legajo, String nombre, String fechaNacimiento, int edad, double salario) {
        super(legajo, nombre, fechaNacimiento, edad, salario);
    }
}
