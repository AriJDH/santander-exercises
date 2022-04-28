package com.santanderbootcamp.LinkTracker.service;

import com.santanderbootcamp.LinkTracker.dto.LinkDto;
import com.santanderbootcamp.LinkTracker.dto.ResponseLinkDto;
import com.santanderbootcamp.LinkTracker.exception.DatosInvalidosException;
import com.santanderbootcamp.LinkTracker.exception.URLInvalidaException;
import com.santanderbootcamp.LinkTracker.model.Link;
import com.santanderbootcamp.LinkTracker.repo.LinkArrayListImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class LinkTracerService implements ILinkTrackerService {
    @Autowired
    LinkArrayListImp linkArrayList;

    @Override
    public ResponseLinkDto agregarUrl(LinkDto linkDto) {
        Link link = new Link(linkDto.getUrl(),linkDto.getPassword());
        try {
            URL url = new URL(link.getUrl());
        } catch (MalformedURLException e) {
            throw new URLInvalidaException("La URL suministrada no es valida");
        }
        return new ResponseLinkDto(linkArrayList.agregarElemento(link), link.getUrl());
    }

    @Override
    public ResponseLinkDto obtenerLinkId(int id, String password) {
        Link link = null;
        try {
            link = linkArrayList.getLinkList().get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new DatosInvalidosException("El id no existe");
        }
        if(!link.getPassword().equals(password)) {
            throw new DatosInvalidosException("El password es incorrecto");
        }
        return new ResponseLinkDto(id, link.getUrl());
    }

    @Override
    public void invalidarLinkId(int id, LinkDto linkDto) {
        Link link = null;
        try {
            link = linkArrayList.getLinkList().get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new DatosInvalidosException("El id no existe");
        }
        if(linkDto.getUrl().equals(link.getUrl())&&linkDto.getPassword().equals(link.getPassword())) {
            linkArrayList.eliminarElemento(id);
        }
        else {
            throw new DatosInvalidosException("La URL o password no coinciden");
        }
    }
}
