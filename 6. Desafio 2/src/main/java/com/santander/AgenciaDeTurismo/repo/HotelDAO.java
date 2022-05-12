package com.santander.AgenciaDeTurismo.repo;

import com.santander.AgenciaDeTurismo.models.Hotel;

public interface HotelDAO extends DAO<String, Hotel> {

    public void confirmarReserva(Hotel hotel);

}
