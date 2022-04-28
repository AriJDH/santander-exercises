package com.santanderbootcamp.LinkTracker.controller;


import com.santanderbootcamp.LinkTracker.dto.LinkDto;
import com.santanderbootcamp.LinkTracker.dto.ResponseLinkDto;
import com.santanderbootcamp.LinkTracker.service.ILinkTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LinkTrackerController {

    @Autowired
    ILinkTrackerService linkTrackerService;

    @PostMapping("/link")
    public ResponseEntity<ResponseLinkDto> nuevaURL(@RequestBody LinkDto linkDto) {
        return new ResponseEntity<>(linkTrackerService.agregarUrl(linkDto), HttpStatus.OK);
    }

    @GetMapping("/link/{id}")
    public RedirectView redireccionar(@PathVariable int id, @RequestParam String password) {
        return new RedirectView(linkTrackerService.obtenerLinkId(id, password).getUrl());
    }

    @GetMapping("/metrics/{id}")
    public ResponseEntity<ResponseLinkDto> estadisticas(@PathVariable int id) {
        return new ResponseEntity<>(linkTrackerService.estadisticasLink(id), HttpStatus.OK);
    }

    @PostMapping("/invalidate/{id}")
    public ResponseEntity<ResponseLinkDto> invalidar(@PathVariable int id, @RequestBody LinkDto linkDto) {
        return new ResponseEntity<>(linkTrackerService.invalidarLinkId(id, linkDto), HttpStatus.OK);
    }
}
