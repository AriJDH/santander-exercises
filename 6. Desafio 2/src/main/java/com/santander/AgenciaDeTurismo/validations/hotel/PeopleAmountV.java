package com.santander.AgenciaDeTurismo.validations.hotel;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({FIELD, ANNOTATION_TYPE, PARAMETER})
@Constraint(validatedBy = PeopleAmountValidator.class)
public @interface PeopleAmountV {
    String message() default "La cantidad de personas debe ser un entero positivo";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
