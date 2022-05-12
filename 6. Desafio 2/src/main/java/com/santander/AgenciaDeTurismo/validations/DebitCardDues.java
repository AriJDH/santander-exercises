package com.santander.AgenciaDeTurismo.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DebitCardDuesValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface DebitCardDues {

    String message() default "La cantidad de cuotas para tarjeta de debito debe ser 1";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
