package com.santander.bootcamp.M4C13.repositories;

import com.santander.bootcamp.M4C13.DTO.LinkCreateDTO;
import com.santander.bootcamp.M4C13.models.Link;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LinkDAO {

    private HashMap<Integer, Link> db = new HashMap<>(
            Map.of(0, new Link(0, "https://docs.oracle.com", 3, true),
                    1, new Link(1, "http://google.com.ar", 2, false),
                    2, new Link(2, "https://github.com/", "1234", 1, true))
    );

    public Link crear(LinkCreateDTO linkCreateDTO) {
        Link link = new Link(linkCreateDTO.getUrl(), db.size());
        db.put(link.getId(), link);
        return link;
    }

    public Link buscar (int linkId) {
        return db.get(linkId);
    }

}
