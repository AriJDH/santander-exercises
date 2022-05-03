package com.bootcamp._desafio_spring.repo;

import com.bootcamp._desafio_spring.dto.VueloDto;
import com.bootcamp._desafio_spring.excepciones.VueloNoExisteException;
import com.bootcamp._desafio_spring.model.FabricaObjetoJson;
import com.bootcamp._desafio_spring.model.Hotel;
import com.bootcamp._desafio_spring.model.Ticket;
import com.bootcamp._desafio_spring.model.Vuelo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class VueloDao implements Dao<String, Vuelo> {

    private List<Vuelo> vuelos = new ArrayList<>();

    public VueloDao() {
        File file = null;
        List<Vuelo> vuelos = new ArrayList<>();
        try {
            file = ResourceUtils.getFile("classpath:vuelos.json");
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Vuelo>> typeRef = new TypeReference<>() {};

        try {
            vuelos = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.vuelos = vuelos;
    }


    @Override
    public List<Vuelo> getElementos() {
        return vuelos;
    }

    @Override
    public Vuelo getElementoPorId(String s) {
        return vuelos.stream().filter(vuelo -> vuelo.getNroVuelo().equalsIgnoreCase(s)).findFirst().orElse(null);
    }

    @Override
    public void agregar(Vuelo nuevoVuelo) {
        JSONArray vuelosJSON = new JSONArray();
        FabricaObjetoJson fabricaObjetoJson = new FabricaObjetoJson();

        for (Vuelo vuelo : vuelos) {
            JSONObject vueloJSON = fabricaObjetoJson.crearJsonVuelo(vuelo);
            vuelosJSON.add(vueloJSON);
        }

        JSONObject nuevoVueloJSON = fabricaObjetoJson.crearJsonVuelo(nuevoVuelo);
        vuelosJSON.add(nuevoVueloJSON);

        vuelos.add(nuevoVuelo);

        try (FileWriter file = new FileWriter("src/main/resources/vuelos.json")) {
            file.write(vuelosJSON.toJSONString().replace("\\",""));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void putElemento(Vuelo vuelo) {
        JSONArray vuelosJSON = new JSONArray();
        FabricaObjetoJson fabricaObjetoJson = new FabricaObjetoJson();

        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getNroVuelo().equalsIgnoreCase(vuelo.getNroVuelo())) {
                vuelos.set(i, vuelo);
            }
        }

        for (Vuelo unVuelo : vuelos) {
            JSONObject vueloJSON = fabricaObjetoJson.crearJsonVuelo(unVuelo);
            vuelosJSON.add(vueloJSON);
        }

        try (FileWriter file = new FileWriter("src/main/resources/vuelos.json")) {
            file.write(vuelosJSON.toJSONString().replace("\\",""));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Vuelo buscarVuelos(String destino, String origen, LocalDate fechaIda) {
        return vuelos.stream().filter(vuelo -> vuelo.getOrigen().equalsIgnoreCase(origen) &&
                vuelo.getDestino().equalsIgnoreCase(destino) && vuelo.getFechaIda().isEqual(fechaIda)).findFirst().orElseThrow(VueloNoExisteException::new);
    }

    public List<Vuelo> obtenerVuelosDisponiblesOptimizado(String origen, String destino, LocalDate fechaIda,LocalDate fechaVuelta) {
        return vuelos.stream().filter(vuelo -> vuelo.getOrigen().equalsIgnoreCase(origen) &&
                vuelo.getDestino().equalsIgnoreCase(destino) &&
                vuelo.getFechaIda().isAfter(fechaIda.minusDays(1)) &&
                vuelo.getFechaVuelta().isBefore(fechaVuelta.plusDays(1))).collect(Collectors.toList());

    }
}
