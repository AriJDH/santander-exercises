package com.santander;

public class Participante {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int num_emergencia;
    private String grupo_sanguineo;
    private int categoria;

    private int num_participante;
    private int monto_a_pagar;

    public Participante(int dni, String nombre, String apellido, int edad, int celular,
                        int num_emergencia, String grupo_sanguineo, int categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.num_emergencia = num_emergencia;
        this.grupo_sanguineo = grupo_sanguineo;
        this.categoria = categoria;
    }

    public int getDni() {return dni;}
    public void setDni(int dni) {this.dni = dni;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getCelular() {return celular;}
    public void setCelular(int celular) {this.celular = celular;}

    public int getNum_emergencia() {return num_emergencia;}
    public void setNum_emergencia(int num_emergencia) {this.num_emergencia = num_emergencia;}

    public String getGrupo_sanguineo() {return grupo_sanguineo;}
    public void setGrupo_sanguineo(String grupo_sanguineo) {this.grupo_sanguineo = grupo_sanguineo;}

    public int getCategoria() {return categoria;}
    public void setCategoria(int categoria) {this.categoria = categoria;}

    public int getNum_participante() {return num_participante;}
    public void setNum_participante(int num_participante) {this.num_participante = num_participante;}

    public double getMonto_a_pagar() {return monto_a_pagar;}
    public void setMonto_a_pagar(int monto_a_pagar) {this.monto_a_pagar = monto_a_pagar;}

    @Override
    public String toString() {
        return "Participante{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", num_emergencia=" + num_emergencia +
                ", grupo_sanguineo='" + grupo_sanguineo + '\'' +
                ", categoria=" + categoria +
                ", num_participante=" + num_participante +
                ", monto_a_pagar=" + monto_a_pagar +
                '}';
    }
}
