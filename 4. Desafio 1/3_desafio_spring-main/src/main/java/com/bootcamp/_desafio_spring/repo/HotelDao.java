package com.bootcamp._desafio_spring.repo;

import com.bootcamp._desafio_spring.dto.HotelDto;
import com.bootcamp._desafio_spring.excepciones.HotelNoExisteException;
import com.bootcamp._desafio_spring.model.FabricaObjetoJson;
import com.bootcamp._desafio_spring.model.Hotel;
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
import java.util.stream.Collectors;

@Repository
public class HotelDao implements Dao<String, Hotel>{

    private List<Hotel> hoteles = new ArrayList<>();

    public HotelDao(){
        File file = null;
        List<Hotel>hoteles = new ArrayList<>();
        try {
            file = ResourceUtils.getFile("classpath:hoteles.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        objectMapper.registerModule(new JavaTimeModule());
        TypeReference<List<Hotel>> typeRef = new TypeReference<>() {};

        try {
            hoteles = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.hoteles = hoteles;

    }


    @Override
    public List<Hotel> getElementos() {
        return hoteles;
    }

    @Override
    public Hotel getElementoPorId(String s) {
        return hoteles.stream().filter(hotel -> hotel.getCodigoHotel().equalsIgnoreCase(s)).findFirst().orElse(null);
    }

    @Override
    public void agregar(Hotel hotel) {
        JSONArray hotelesJSON = new JSONArray();
        FabricaObjetoJson fabricaObjetoJson = new FabricaObjetoJson();

        for (Hotel unHotel : hoteles) {
            JSONObject hotelJSON = fabricaObjetoJson.crearJsonHotel(unHotel);
            hotelesJSON.add(hotelJSON);
        }

        JSONObject hotelJSON = fabricaObjetoJson.crearJsonHotel(hotel);
        hoteles.add(hotel);
        hotelesJSON.add(hotelJSON);

        try (FileWriter file = new FileWriter("src/main/resources/hoteles.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(hotelesJSON.toJSONString().replace("\\",""));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void putElemento(Hotel hotelActualizar) {
        JSONArray hotelesJSON = new JSONArray();
        FabricaObjetoJson fabricaObjetoJson = new FabricaObjetoJson();

        for (int i = 0; i < hoteles.size(); i++) {
            if (hoteles.get(i).getCodigoHotel().equalsIgnoreCase(hotelActualizar.getCodigoHotel())) {
                hoteles.set(i, hotelActualizar);
            }
        }

        for (Hotel unHotel : hoteles) {
            JSONObject hotelJSON = fabricaObjetoJson.crearJsonHotel(unHotel);
            hotelesJSON.add(hotelJSON);
        }

        try (FileWriter file = new FileWriter("src/main/resources/hoteles.json")) {
            file.write(hotelesJSON.toJSONString().replace("\\",""));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Hotel> getElementosPorPeriodo(String destination, LocalDate fechaDesde, LocalDate fechaHasta) {
        return hoteles.stream().filter(hotel -> hotel.getLugarOCiudad().equalsIgnoreCase(destination) && hotel.estaEnPeriodo(fechaDesde, fechaHasta)).collect(Collectors.toList());
    }

}
