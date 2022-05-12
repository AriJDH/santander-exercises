package com.santanderbootcamp.desafio_spring.validations;

import com.santanderbootcamp.desafio_spring.dto.request.BookingDto;
import com.santanderbootcamp.desafio_spring.dto.request.FlightReservationDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ConstructorValidacionPorFecha implements ConstraintValidator<ValidacionPorFecha, Object> {

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraint) {
        if (o instanceof BookingDto) {
            return ((BookingDto) o).getDateFrom().isBefore(((BookingDto) o).getDateTo());
        }
        else if (o instanceof FlightReservationDto) {
            return ((FlightReservationDto) o).getDateFrom().isBefore(((FlightReservationDto) o).getDateTo());
        }
        return false;
    }
}