package com.bootcamp._desafio_spring.repo;

import com.bootcamp._desafio_spring.model.Booking;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservaDao implements Dao<Integer, Booking>{

    private List<Booking> bookings = new ArrayList<>();
    private Integer contador = 0;


    @Override
    public List<Booking> getElementos() {
        return null;
    }

    @Override
    public Booking getElementoPorId(Integer integer) {
        return null;
    }

    @Override
    public void agregar(Booking elemento) {
        elemento.setId(contador);
        bookings.add(elemento);
        contador ++;
    }

    @Override
    public void putElemento(Booking elemento) {

    }

    public boolean existeReserva(String codigoHotel, LocalDate desde, LocalDate hasta){
        return bookings.stream().anyMatch(booking ->
                booking.getCodigoHotel().equalsIgnoreCase(codigoHotel)&&!booking.periodoNoSeSolapa(desde,hasta));
    }
}
