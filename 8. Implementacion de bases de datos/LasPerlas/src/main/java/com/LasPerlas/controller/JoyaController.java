package com.LasPerlas.controller;

import com.LasPerlas.dto.response.JoyaDto;
import com.LasPerlas.service.IJoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {

    @Autowired
    private IJoyaService joyaService;

    @PostMapping("/jewerly/new")
    public String createJoya(@RequestBody JoyaDto joyaDtoResponse){
        joyaService.saveJoya(joyaDtoResponse);
        return "La joya " + joyaDtoResponse.getNombre()+ " se guardo correctamente en la bbdd";
    }

    @GetMapping("/jewerly")
    public List<JoyaDto> getAllJoyas(){
        List<JoyaDto> joyaDtoResponseList = joyaService.getAllJoyas();
        return  joyaDtoResponseList;

    }
    @GetMapping("/jewerly/ventaIsTrue")
    public List<JoyaDto> getJoyasventaIsTrue(){
        List<JoyaDto> joyaDtoResponseList = joyaService.getJoyasByventaONoTrue();
        return  joyaDtoResponseList;

    }

    @GetMapping("/jewerly/{nro_identificatorio}")
    public ResponseEntity<JoyaDto> getJoyaById(@PathVariable Long nro_identificatorio){

        return  ResponseEntity.ok().body(joyaService.findJoya(nro_identificatorio));

    }

    @PutMapping("/jewerly/delete/{nro_identificatorio}")
    public String deleteJoya(@PathVariable Long nro_identificatorio){
        joyaService.deleteJoya(nro_identificatorio);
        return "Se cambio el estado correctamente, ya no esta disponible para la venta";
    }

    @PutMapping("/jewerly/update/{nro_identificatorio}")
    public JoyaDto updateJoya(@PathVariable Long nro_identificatorio, @RequestBody JoyaDto joyaDtoResponse){
        joyaService.updateJoya(nro_identificatorio,joyaDtoResponse);
        return joyaService.findJoya(nro_identificatorio);
    }

}
