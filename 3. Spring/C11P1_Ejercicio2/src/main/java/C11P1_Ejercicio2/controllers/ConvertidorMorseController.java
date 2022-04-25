package C11P1_Ejercicio2.controllers;

import C11P1_Ejercicio2.models.ConvertidorMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConvertidorMorseController {


        @GetMapping(path = "/convertir")
        public String convertir(@RequestParam(value = "codigo", defaultValue = "0") String codigo){
            return ConvertidorMorse.convertir(codigo);
        }

}

