package com.santander.bootcamp.M4C13.services;

import com.santander.bootcamp.M4C13.DTO.LinkCreateDTO;
import com.santander.bootcamp.M4C13.DTO.LinkIdDTO;
import com.santander.bootcamp.M4C13.DTO.LinkMetricsDTO;
import com.santander.bootcamp.M4C13.DTO.LinkStatusDTO;
import com.santander.bootcamp.M4C13.exceptions.LinkInactiveException;
import com.santander.bootcamp.M4C13.exceptions.LinkInvalidException;
import com.santander.bootcamp.M4C13.exceptions.LinkInvalidPasswordException;
import com.santander.bootcamp.M4C13.exceptions.LinkNotFoundException;
import com.santander.bootcamp.M4C13.models.Link;
import com.santander.bootcamp.M4C13.repositories.LinkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@Service
public class LinkService {

    @Autowired
    LinkDAO linkDAO;

    public LinkIdDTO crearLink (LinkCreateDTO linkCreateDTO) {
        try {
            // En caso de encontrarse con una excepcion, es porque la url es invalida
            new URL(linkCreateDTO.getUrl());
        } catch (MalformedURLException e) {
            throw new LinkInvalidException("La URL no es válida");
        }

        return new LinkIdDTO(linkDAO.crear(linkCreateDTO));
    }

    public String redirigirLink (int linkId, Optional<String> password) {
        Link buscado = linkDAO.buscar(linkId);
        if (buscado == null) throw new LinkNotFoundException(String.format("No existe link con id %d", linkId));
        if (!buscado.isActive()) throw new LinkInactiveException("El link se encuentra inactivo");
        if (buscado.getPassword() != null && (password.isEmpty() || !buscado.getPassword().equals(password.get()))) throw new LinkInvalidPasswordException("La contraseña es incorrecta");
        buscado.sumarRedirects();
        return buscado.getUrl();
    }

    public LinkMetricsDTO obtenerMetricas (int linkId) {
        Link buscado = linkDAO.buscar(linkId);
        if (buscado == null) throw new LinkNotFoundException(String.format("No existe link con id %d", linkId));

        return new LinkMetricsDTO(buscado);
    }

    public LinkStatusDTO invalidarLink (int linkId) {
        Link buscado = linkDAO.buscar(linkId);
        if (buscado == null) throw new LinkNotFoundException(String.format("No existe link con id %d", linkId));

        buscado.setActive(false);

        return new LinkStatusDTO(buscado);
    }

}
