package com.santander.AgenciaDeTurismo.validations.hotel;


import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PeopleAmountValidator implements ConstraintValidator<PeopleAmountV, Integer> {


    @Override
    public void initialize(PeopleAmountV constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer i, ConstraintValidatorContext constraintValidatorContext) {

        // TODO: 10/05/2022 probar con object
        return i>0;
    }
}