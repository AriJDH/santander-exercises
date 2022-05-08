package com.santander.DesafioSpring.repo;

import com.santander.DesafioSpring.models.Hotel;

public interface HotelDAO extends DAO<String, Hotel> {

    public void confirmarReserva(Hotel hotel);

}
