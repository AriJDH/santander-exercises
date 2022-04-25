package C11P1_Ejercicio_1.controllers;


import C11P1_Ejercicio_1.models.ConvertidorARomano;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorController {

    @GetMapping(path = "/convertir")
    public String convertirEnRomanos(@RequestParam(value = "numero", defaultValue = "0") int num){
        return ConvertidorARomano.convertir(num);
    }

}
