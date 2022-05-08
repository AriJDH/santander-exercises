package com.santander.DesafioSpring.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.santander.DesafioSpring.exceptions.HotelAlreadyReservedException;
import com.santander.DesafioSpring.exceptions.HotelFechaException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hotel {
    private String hotelCode;
    private String name;
    private String destination;
    private String roomType;
    private double price;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateTo;
    @JsonProperty(value = "isReserved")
    private boolean isReserved;

    public boolean isAvailable(LocalDate start, LocalDate end) {
        if(end.isBefore(start)) throw new HotelFechaException("La fecha de salida no puede ser previa a la de llegada");
        if(isReserved) {
            throw new HotelAlreadyReservedException("El hotel ya fue reservado por otra persona");
        }
        return (dateFrom.isBefore(start) || dateFrom.equals(start)) && (dateTo.isAfter(end) || dateTo.equals(end));
    }

}
