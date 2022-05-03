package com.santander.bootcamp.M4C13.controllers;

import com.santander.bootcamp.M4C13.DTO.LinkCreateDTO;
import com.santander.bootcamp.M4C13.DTO.LinkIdDTO;
import com.santander.bootcamp.M4C13.DTO.LinkMetricsDTO;
import com.santander.bootcamp.M4C13.DTO.LinkStatusDTO;
import com.santander.bootcamp.M4C13.models.Link;
import com.santander.bootcamp.M4C13.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.websocket.server.PathParam;
import java.util.Optional;

@Controller
public class LinkController {

    @Autowired
    LinkService linkService;

    @PostMapping("/link")
    public ResponseEntity<LinkIdDTO> crearLink (@RequestBody LinkCreateDTO linkCreateDTO) {
        return new ResponseEntity<>(linkService.crearLink(linkCreateDTO), HttpStatus.CREATED);
    }

    @GetMapping("/link/{linkId}")
    public RedirectView redirigirLink (@PathVariable int linkId, @RequestParam Optional<String> password) {
        return new RedirectView(linkService.redirigirLink(linkId, password));
    }

    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<LinkMetricsDTO> obtenerMetricas (@PathVariable int linkId) {
        return new ResponseEntity<>(linkService.obtenerMetricas(linkId), HttpStatus.OK);
    }

    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity<LinkStatusDTO> invalidarLink (@PathVariable int linkId) {
        return new ResponseEntity<>(linkService.invalidarLink(linkId), HttpStatus.OK);
    }

}
