package com.clase.C12P1.controladores;

import com.clase.C12P1.modelo.EdadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraEdadesControlador {

    @GetMapping("/{dia}/{mes}/{anio}")
    public EdadDTO getEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio){
        EdadDTO edadDTO = new EdadDTO();
        edadDTO.setFecha(dia+"/"+mes+"/"+anio);
        edadDTO.setEdad();
        return edadDTO;
    }

}
