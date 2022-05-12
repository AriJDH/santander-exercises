package com.santander.AgenciaDeTurismo.validations.vuelo;

import com.santander.AgenciaDeTurismo.validations.hotel.PeopleAmountValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;



@Documented
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = DepartureIsBeforeArrivalValidator.class)
public @interface DepartureIsBeforeArrival {
    String message() default "La fecha de vuelta debe ser mayor a la de ida";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}