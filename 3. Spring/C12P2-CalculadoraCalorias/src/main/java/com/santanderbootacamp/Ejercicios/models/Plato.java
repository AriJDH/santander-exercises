package com.santanderbootacamp.Ejercicios.models;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plato {
    String name;
    List<Ingrediente> ingredientes;
}
