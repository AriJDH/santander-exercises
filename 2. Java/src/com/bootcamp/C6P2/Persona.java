package com.bootcamp.C6P2;

public class Persona {
    private int dni = 0;
    private String nombre = "";
    private String apellido;
    private int edad = 0;
    private long nro_celular;
    private long nro_emergencia;
    private String grupo_sanguineo;
    private int numero_corredor = -1;

    //TODO: agregar parametros faltantes
    public Persona(int dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void set_numero(int numero) {
        this.numero_corredor = numero;
    }

    public float pagar(int limite_edad, float precio_menor_limite, float precio_mayor_limite) {
        float abono = 0;
        abono = precio_mayor_limite;
        if(edad < limite_edad){
            abono = precio_menor_limite;
        }
        return abono;
    }

    @Override
    public String toString() {
        return "Nro inscripto: " + this.numero_corredor +
                " \n Nombre: " + this.nombre +
                " \n dni: " + this.dni;
    }
}
