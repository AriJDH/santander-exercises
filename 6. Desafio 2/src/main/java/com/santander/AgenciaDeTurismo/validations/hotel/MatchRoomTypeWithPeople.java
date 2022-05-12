package com.santander.AgenciaDeTurismo.validations.hotel;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MatchRoomTypeWithPeopleValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface MatchRoomTypeWithPeople {

    String message() default "No coincide la cantidad de gente con el tipo de habitacion";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}