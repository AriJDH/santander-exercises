package com.bootcamp.practicosC12P1.controllers;

import com.bootcamp.practicosC12P1.models.Diploma;
import com.bootcamp.practicosC12P1.services.DiplomaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiplomaController {

    DiplomaService service = new DiplomaService();

    @GetMapping(path = "getDiplomas")
    public List<Diploma> getDiplomas(){
        return service.getDiplomas();
    }

    /*
    @PostMapping(path = "addDiploma")
    public void addDiploma(){
        service.addDiploma();
    }

     */

}
