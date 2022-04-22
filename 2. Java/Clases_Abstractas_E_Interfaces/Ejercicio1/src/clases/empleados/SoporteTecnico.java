package clases.empleados;

import clases.general.Empleado;

public class SoporteTecnico extends MiembrosPersonal {
    private String sector;

    public SoporteTecnico(int legajo, String nombre, String fechaNacimiento, int edad, double salario, String sector) {
        super(legajo, nombre, fechaNacimiento, edad, salario);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public void laburar() {
        System.out.println("Laburo como Soporte Tecnico!");
    }
}
