package C11P2_Ejercicio1_3.controllers;

import C11P2_Ejercicio1_3.models.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/hello")
    public String saludar(){
        return Saludo.saludar();
    }

    @GetMapping(path= "/hello/{nombre}")
    public String presentar(@PathVariable String nombre){
        return Saludo.saludarConNombre(nombre);
    }

    @GetMapping(path= "/hello/{nombre}/{apellido}/{edad}")
    public String presentar(@PathVariable String nombre,@PathVariable String apellido, @PathVariable int edad){
        return Saludo.saludarCompleto(nombre,apellido,edad);
    }








}
