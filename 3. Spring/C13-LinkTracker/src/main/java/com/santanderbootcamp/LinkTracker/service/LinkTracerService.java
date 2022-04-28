package com.santanderbootcamp.LinkTracker.service;

import com.santanderbootcamp.LinkTracker.dto.LinkDto;
import com.santanderbootcamp.LinkTracker.dto.ResponseLinkDto;
import com.santanderbootcamp.LinkTracker.exception.DatosInvalidosException;
import com.santanderbootcamp.LinkTracker.model.Link;
import com.santanderbootcamp.LinkTracker.repo.LinkHashmapImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class LinkTracerService implements ILinkTrackerService {
    @Autowired
    LinkHashmapImp linkHashmapImp;

    @Override
    public ResponseLinkDto agregarUrl(LinkDto linkDto) {
        Link link = new Link(linkDto.getUrl(),linkDto.getPassword(), 0);
        try {
            URL url = new URL(link.getUrl());
        } catch (MalformedURLException e) {
            throw new DatosInvalidosException("La URL suministrada no es valida");
        }
        return new ResponseLinkDto(linkHashmapImp.agregarElemento(link), link.getUrl(), "Se ha insertado el link");
    }

    @Override
    public ResponseLinkDto obtenerLinkId(int id, String password) {
        Link link = linkHashmapImp.obtenerElemento(id);
        if(!link.getPassword().equals(password)) {
            throw new DatosInvalidosException("El password es incorrecto");
        }
        try {
            URL url = new URL(link.getUrl());
            url.openConnection();
        } catch (Exception e) {
            throw new DatosInvalidosException("El password es incorrecto");
        }
        return new ResponseLinkDto(id, link.getUrl(), "Link encontrado");
    }

    public ResponseLinkDto estadisticasLink(int id) {
        Link link = linkHashmapImp.obtenerElemento(id);
        return new ResponseLinkDto(id, link.getUrl(), link.getAccesos() + " accesos");
    }

    @Override
    public ResponseLinkDto invalidarLinkId(int id, LinkDto linkDto) {
        Link link = linkHashmapImp.obtenerElemento(id);
        ResponseLinkDto responseLinkDto = new ResponseLinkDto();
        if(linkDto.getUrl().equals(link.getUrl())&&linkDto.getPassword().equals(link.getPassword())) {
            responseLinkDto.setId(id);
            responseLinkDto.setUrl(link.getUrl());
            responseLinkDto.setDescripcion("Se ha eliminado el link");
            linkHashmapImp.eliminarElemento(id);
        }
        else {
            throw new DatosInvalidosException("La URL o password no coinciden");
        }
        return responseLinkDto;
    }
}
