package com.bootcamp.C6P2;

public class Persona {
    private int dni = 0;
    private String nombre = "";
    private String apellido;
    private int edad = 0;
    private long nro_celular;
    private long nro_emergencia;
    private String grupo_sanguineo;
    private int id_corredor = -1;
    private float monto_abonado;

    //TODO: agregar parametros faltantes
    public Persona(int dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        monto_abonado = 0;
    }

    public void set_numero(int numero) {
        this.id_corredor = numero;
    }

    public float pagar(int limite_edad, float precio_menor_limite, float precio_mayor_limite) {
        float abono = 0;
        abono = precio_mayor_limite;
        if(edad < limite_edad){
            abono = precio_menor_limite;
        }
        this.monto_abonado = abono;
        return abono;
    }

    @Override
    public String toString() {
        return "Nro inscripto: " + this.id_corredor +
                " \n Nombre: " + this.nombre +
                " \n dni: " + this.dni +
                "\n monto abonado: " + this.monto_abonado;
    }

    public Integer get_id() {
        return this.id_corredor;
    }

    public float get_abono() {
        return this.monto_abonado;
    }



    public boolean puede_participar(int edad_minima) {
        return this.edad > edad_minima;
    }
}
