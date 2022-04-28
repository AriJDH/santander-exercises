package com.santanderbootcamp.LinkTracker.repo;

import com.santanderbootcamp.LinkTracker.model.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkArrayListImp implements Dao<Integer, Link>{
    List<Link> linkList = new ArrayList<>();

    @Override
    public int agregarElemento(Link elemento) {
        int tamanioLista = linkList.size();
        linkList.add(elemento);
        return tamanioLista;
    }

    @Override
    public void eliminarElemento(Integer elemento) {
        linkList.remove(elemento);
    }
}
