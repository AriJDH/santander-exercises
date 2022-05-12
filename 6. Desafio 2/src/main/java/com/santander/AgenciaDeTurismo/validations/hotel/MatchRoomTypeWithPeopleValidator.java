package com.santander.AgenciaDeTurismo.validations.hotel;

import com.santander.AgenciaDeTurismo.dtos.BookingDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchRoomTypeWithPeopleValidator implements ConstraintValidator<MatchRoomTypeWithPeople, BookingDTO> {


    public void initialize(MatchRoomTypeWithPeople constraintAnnotation) {
    }

    public boolean isValid(BookingDTO booking, ConstraintValidatorContext context) {
        switch(booking.getPeopleAmount()){
            case 1 : return booking.getRoomType().equals("SINGLE");
            case 2 : return booking.getRoomType().equals("DOUBLE");
            case 3 : return booking.getRoomType().equals("TRIPLE");
            default : return booking.getRoomType().equals("MULTIPLE");
        }
    }
}