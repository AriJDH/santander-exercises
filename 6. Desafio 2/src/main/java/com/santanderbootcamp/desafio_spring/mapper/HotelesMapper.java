package com.santanderbootcamp.desafio_spring.mapper;

import com.santanderbootcamp.desafio_spring.dto.request.BookingDto;
import com.santanderbootcamp.desafio_spring.dto.HotelesDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponseBookingDto;
import com.santanderbootcamp.desafio_spring.modelos.Hoteles;
import org.springframework.stereotype.Component;

@Component("HotelesMapper")
public class HotelesMapper implements IMapper<HotelesDto, Hoteles>{

    //Mappeo de los datos de Hoteles a HotelesDto
    @Override
    public HotelesDto toDto(Hoteles hotel) {
        HotelesDto hotelDto = new HotelesDto();
        hotelDto.setCodigoHotel(hotel.getCodigoHotel());
        hotelDto.setNombre(hotel.getNombre());
        hotelDto.setLugarOciudad(hotel.getLugarOCiudad());
        hotelDto.setHabitacionTipo(hotel.getHabitacionTipo());
        hotelDto.setPrecioNoche(hotel.getPrecioNoche());
        hotelDto.setDisponibleDesde(hotel.getDisponibleDesde());
        hotelDto.setDisponibleHasta(hotel.getDisponibleHasta());
        hotelDto.setReservado(hotel.getReservado());
        return hotelDto;
    }

    //Mappeo de los datos de HotelesDto a Hoteles
    @Override
    public Hoteles dtoTo(HotelesDto hotelDto) {
        Hoteles hotel = new Hoteles();
        hotel.setCodigoHotel(hotelDto.getCodigoHotel());
        hotel.setNombre(hotelDto.getNombre());
        hotel.setLugarOCiudad(hotelDto.getLugarOciudad());
        hotel.setPrecioNoche(hotelDto.getPrecioNoche());
        hotel.setDisponibleDesde(hotelDto.getDisponibleDesde());
        hotel.setDisponibleHasta(hotelDto.getDisponibleHasta());
        hotel.setHabitacionTipo(hotelDto.getHabitacionTipo());
        hotel.setReservado(hotelDto.getReservado());
        return hotel;
    }

    //Mapeo de los datos del BookingDto a ResponseBookingDto (se traer la información de la reserva de hotel)
    public ResponseBookingDto responseBooking (BookingDto element) {
        ResponseBookingDto bookingDto = new ResponseBookingDto();
        bookingDto.setDateFrom(element.getDateFrom());
        bookingDto.setDateTo(element.getDateTo());
        bookingDto.setDestination(element.getDestination());
        bookingDto.setHotelCode(element.getHotelCode());
        bookingDto.setPeopleAmount(element.getPeopleAmount());
        bookingDto.setRoomType(element.getRoomType());
        bookingDto.setPeople(element.getPeople());
        return bookingDto;
    }
}
