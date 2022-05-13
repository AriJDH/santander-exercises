package com.santanderbootcamp.desafio_spring.validations;

import com.santanderbootcamp.desafio_spring.modelos.PaymentMethod;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ConstructorValidacionCuotas implements ConstraintValidator<ValidacionCuotas, PaymentMethod> {

    @Override
    public boolean isValid(PaymentMethod paymentMethod, ConstraintValidatorContext constraint) {
        return (paymentMethod.getType().equals("DEBIT") && paymentMethod.getDues() == 0) ||
               (paymentMethod.getType().equals("CREDIT") && paymentMethod.getDues() > 0);
    }
}





