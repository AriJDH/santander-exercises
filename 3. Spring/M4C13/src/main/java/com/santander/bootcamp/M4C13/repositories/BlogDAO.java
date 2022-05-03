package com.santander.bootcamp.M4C13.repositories;

import com.santander.bootcamp.M4C13.DTO.EntradaBlogDTO;
import com.santander.bootcamp.M4C13.exceptions.EntradaBlogIdAlreadyExistsException;
import com.santander.bootcamp.M4C13.exceptions.EntradaBlogNotFoundException;
import com.santander.bootcamp.M4C13.models.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class BlogDAO implements DAO<EntradaBlogDTO> {

    private HashMap<Integer, EntradaBlog> db = new HashMap<>(
            Map.of(1, new EntradaBlog(1, "3 Cosas que no sabias de Messi", "Juan Marques", LocalDate.of(2022,04,28)))
    );

    @Override
    public EntradaBlogDTO crear(EntradaBlogDTO entradaRecibida) {
        if (db.containsKey(entradaRecibida.getId())) {
            throw new EntradaBlogIdAlreadyExistsException(String.format("La entrada %d ya existe", entradaRecibida.getId()));
        }

        db.put(entradaRecibida.getId(), new EntradaBlog(entradaRecibida));
        return new EntradaBlogDTO(db.get(entradaRecibida.getId()));
    }

    @Override
    public EntradaBlogDTO buscar(int id) {
        if (!db.containsKey(id)) throw new EntradaBlogNotFoundException("La entrada no existe");
        return new EntradaBlogDTO(db.get(id));
    }

    @Override
    public List<EntradaBlogDTO> listar() {
        return db.entrySet().stream().map(x -> new EntradaBlogDTO(x.getValue())).collect(Collectors.toList());
    }

}
