package com.santanderbootcamp.desafio_spring.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ConstructorValidacionPorFecha.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidacionPorFecha {

    String message() default "La fecha de entrada es mayor a la fecha de salida";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List
    {
        ValidacionPorFecha[] value();
    }
}
