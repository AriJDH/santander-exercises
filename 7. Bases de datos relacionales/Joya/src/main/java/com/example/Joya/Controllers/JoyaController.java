package com.example.Joya.Controllers;

import com.example.Joya.Dtos.JoyaDto;
import com.example.Joya.Dtos.JoyaResponseDto;
import com.example.Joya.Dtos.SuccessDto;
import com.example.Joya.Services.JoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoyaController {

    @Autowired
    JoyaService joyaService;

    @GetMapping("/jewerly")
    public ResponseEntity<List<JoyaResponseDto>> listJoyas(){
        return ResponseEntity.ok().body(joyaService.findAllJoyas());
    }

    @PostMapping("/jewerly")
    public ResponseEntity<SuccessDto> addStudent(@RequestBody JoyaDto joya){
        if(this.joyaService.addJoya(joya)){
            return ResponseEntity.ok()
                    .body(new SuccessDto("Se ha creado la joya", HttpStatus.CREATED.value()));
            // new ResponseEntity<SuccessDTO>(
            // new SuccessDTO("Se ha creado el alumno", HttpStatus.CREATED.value()), HttpStatus.ACCEPTED);
        }
        else
            throw new RuntimeException();
    }
}
