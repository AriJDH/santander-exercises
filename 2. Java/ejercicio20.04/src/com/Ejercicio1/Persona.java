package com.Ejercicio1;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;




    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;

    }

    public float calcularIMC(){
        double valorIMC;
        int devolver;
        valorIMC= peso/(Math.pow(altura,2));
        if(valorIMC < 20){
            devolver = -1;
        } else if( valorIMC >= 20 && valorIMC <= 25){
            devolver = 0;
        }else{
            devolver = 1;
        }

        return devolver;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor;

        if(edad<18){
            esMayor = false;

        }else{
            esMayor = true;

        }
        return esMayor;
    }

    public String mostrarDatos(){
        String mensajeIMC;
        String mensajeEdad;
        if(esMayorDeEdad() == false){
            mensajeEdad = "sos menor de edad";
        }else{
            mensajeEdad = "sos mayor de edad";
        }
        if(calcularIMC() == -1){
            mensajeIMC = "tu peso es bajo.";
        } else if(calcularIMC() == 0){
            mensajeIMC = "tu peso es saludable.";
        }else{
            mensajeIMC = "tenes sobrepeso.";
        }
        return mensajeEdad +" y "+ mensajeIMC;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
