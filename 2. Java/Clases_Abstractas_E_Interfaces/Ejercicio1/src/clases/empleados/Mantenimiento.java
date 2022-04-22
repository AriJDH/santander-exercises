package clases.empleados;

import clases.general.Empleado;

public class Mantenimiento extends MiembrosPersonal {

    private String especializacion;

    public Mantenimiento(int legajo, String nombre, String fechaNacimiento, int edad, double salario, String especializacion) {
        super(legajo, nombre, fechaNacimiento, edad, salario);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public void laburar() {
        System.out.println("Laburo en Mantenimiento!");
    }
}
