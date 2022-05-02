package com.example.C13EjercicioPracticoBlog.repo;


import java.util.HashMap;
import java.util.List;

public interface DAO <K,E> {
    public HashMap<Integer, E> obtener_blogs();
    public Integer crear_blog(E clave);
}
