package c11exercises.p2.ejercicioClase.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No existe esta persona")
public class PersonaNotFoundException extends RuntimeException {

    public PersonaNotFoundException (String msg) {
        super(msg);
    }

}
