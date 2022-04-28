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

    @PostMapping("/invalidate/{id}")
    public ResponseEntity<String> invalidar(@PathVariable int id, @RequestBody LinkDto linkDto) {
        linkTrackerService.invalidarLinkId(id, linkDto);
        return new ResponseEntity<>("El link fue eliminado", HttpStatus.OK);
    }
    /*
    public RedirectView redirection() throws MalformedURLException {
        URL url = null;
        String direccion = "htwww.yahoo.com";
        url = new URL(direccion);
        return new RedirectView(direccion);
    }*/
}
