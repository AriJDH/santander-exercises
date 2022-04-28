package com.santanderbootcamp.LinkTracker.repo;

import com.santanderbootcamp.LinkTracker.exception.DatosInvalidosException;
import com.santanderbootcamp.LinkTracker.model.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkHashmapImp implements Dao<Integer, Link>{
    private HashMap<Integer,Link> linkHashMap = new HashMap<>();
    private int siguienteId = 0;

    @Override
    public int agregarElemento(Link elemento) {
        linkHashMap.put(siguienteId,elemento);
        return siguienteId++;
    }

    @Override
    public Link obtenerElemento(Integer elemento) {
        Link link = linkHashMap.get(elemento);
        if(link == null) {
            throw new DatosInvalidosException("El id no existe");
        }
        return link;
    }

    @Override
    public void eliminarElemento(Integer elemento) {
        linkHashMap.remove(elemento);
    }
}
