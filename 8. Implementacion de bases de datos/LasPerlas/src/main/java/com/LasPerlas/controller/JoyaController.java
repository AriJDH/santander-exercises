package com.LasPerlas.controller;

import com.LasPerlas.dto.response.JoyaDtoResponse;
import com.LasPerlas.entity.Joya;
import com.LasPerlas.service.IJoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {

    @Autowired
    private IJoyaService joyaService;

    @PostMapping("/jewerly/new")
    public String createJoya(@RequestBody JoyaDtoResponse joyaDtoResponse){
        joyaService.saveJoya(joyaDtoResponse);
        return "La joya " + joyaDtoResponse.getNombre()+ " se guardo correctamente en la bbdd";
    }

    @GetMapping("/jewerly")
    public List<JoyaDtoResponse> getAllJoyas(){
        List<JoyaDtoResponse> joyaDtoResponseList = joyaService.getJoyas();
        return  joyaDtoResponseList;

    }

    @PutMapping("/jewerly/delete/{id}")
    public JoyaDtoResponse deleteJoya(@RequestParam long id){
        JoyaDtoResponse joyaDtoResponse = joyaService.findJoya(id);

        joyaService.saveJoya(joyaDtoResponse);
        return joyaDtoResponse;
    }

}
