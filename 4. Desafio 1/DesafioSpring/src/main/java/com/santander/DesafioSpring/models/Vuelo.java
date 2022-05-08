package com.santander.DesafioSpring.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vuelo {
    private String flightNumber;
    private String origin;
    private String destination;
    private String seatType;
    private double price;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateTo;

    public boolean isAvailable(LocalDate fechaIda){
        return fechaIda.equals(this.dateFrom);
    }

}
