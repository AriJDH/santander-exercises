package com.santander.AgenciaDeTurismo.validations;

import com.santander.AgenciaDeTurismo.dtos.CreditCardDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class DebitCardDuesValidator implements ConstraintValidator<DebitCardDues, CreditCardDTO> {

    public void initialize(DebitCardDues constraintAnnotation) {
    }

    public boolean isValid(CreditCardDTO booking, ConstraintValidatorContext context) {

        if(booking.getType().equals("DEBIT")) {
            return booking.getDues() == 1;
        }
        return true;
    }
}


