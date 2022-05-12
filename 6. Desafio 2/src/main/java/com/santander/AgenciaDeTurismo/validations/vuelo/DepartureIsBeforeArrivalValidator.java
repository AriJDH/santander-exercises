package com.santander.AgenciaDeTurismo.validations.vuelo;

import com.santander.AgenciaDeTurismo.dtos.ReservationDTO;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;


@Component
public class DepartureIsBeforeArrivalValidator implements ConstraintValidator<DepartureIsBeforeArrival, ReservationDTO> {

    @Override
    public void initialize(DepartureIsBeforeArrival constraintAnnotation) {
    }

    @Override
    public boolean isValid(ReservationDTO reservationDTO, ConstraintValidatorContext constraintValidatorContext) {
        return reservationDTO.getDateFrom().isBefore(reservationDTO.getDateTo()) || reservationDTO.getDateFrom().isEqual(reservationDTO.getDateTo()) ;
    }
}