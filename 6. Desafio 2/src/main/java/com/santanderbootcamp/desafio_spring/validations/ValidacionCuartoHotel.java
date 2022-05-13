package com.santanderbootcamp.desafio_spring.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ConstructorValidacionCuartoHotel.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidacionCuartoHotel {

    String message() default "El tipo de habitación no coincide con la cantidad de personas.";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};

}
