package com.santanderbootcamp.desafio_spring.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ConstructorValidacionCuotas.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidacionCuotas {

    String message() default "Número de cuotas inválido. Tarjeta de débito admite un sólo pago. Tarjeta de crédito admite pagos en cuotas";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};

}
