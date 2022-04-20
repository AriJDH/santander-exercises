package com.bootcamp.clase.modelos;

import com.bootcamp.C6P2.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libro {

    public String nombre;
    public List<Autor> autores;
    public HashMap<Integer, List<Autor>> capitulo_autores;

    public Libro() {}

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this. autores = new ArrayList<>();
        this.capitulo_autores = new HashMap<>();
    }

    public static void info() {
        System.out.println("Es un libro");
    }

    public String mostrar_info() {
        return "nombre " + nombre + " autores " + autores;
    }

    public void agregar_autores(List<Autor> autores) {
        this.autores.addAll(autores);
    }

    public void agregar_autores_a_capitulo(Integer capitulo, List<Autor> autores){
        capitulo_autores.put(capitulo, autores);
    }

    public void mostrar_autores_por_capitulo(){
        for(Map.Entry<Integer, List<Autor>> entrada : capitulo_autores.entrySet()){
            Integer capitulo = entrada.getKey();
            List<Autor> autores = entrada.getValue();
            System.out.println("Capitulo \"" + capitulo + "\" autores \"" + autores + "\"");
        }

    }
}
