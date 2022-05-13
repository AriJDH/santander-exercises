package com.santanderbootcamp.desafio_spring.validations;

import com.santanderbootcamp.desafio_spring.dto.request.BookingDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ConstructorValidacionCuartoHotel implements ConstraintValidator<ValidacionCuartoHotel, BookingDto> {

    @Override
    public boolean isValid(BookingDto bookingDto, ConstraintValidatorContext constraint) {
        int roomTypeNumber = 0;
        switch (bookingDto.getRoomType()){
            case "Single": roomTypeNumber = 1; break;
            case "Doble": roomTypeNumber = 2; break;
            case "Triple": roomTypeNumber = 3; break;
            case "Múltiple": roomTypeNumber = 4; break;
        }
        return bookingDto.getPeopleAmount() == roomTypeNumber;
    }
}