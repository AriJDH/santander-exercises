package com.santander.sistema;

public class Autor {
    private String nombre;
    private String alias;

    public Autor(String nombre, String alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

    public String getNombre() {return nombre;}

    public String getAlias() {return alias;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setAlias(String alias) {this.alias = alias;}

    public String toString (){
        return "Nombre: "+getNombre()+ ", Alias : "+getAlias();
    }
}
