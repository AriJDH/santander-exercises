package com.bootcamp._desafio_spring.service;

import com.bootcamp._desafio_spring.dto.*;
import com.bootcamp._desafio_spring.excepciones.*;
import com.bootcamp._desafio_spring.model.Booking;
import com.bootcamp._desafio_spring.model.Hotel;
import com.bootcamp._desafio_spring.model.Vuelo;
import com.bootcamp._desafio_spring.repo.HotelDao;
import com.bootcamp._desafio_spring.repo.ReservaDao;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelService {
    private final double INTERES = 1.21;

    private final HotelDao hotelDao = new HotelDao();
    private final ReservaDao reservaDao = new ReservaDao();

    public RespuestaReservaDto reservar(RequestReservaDto requestReservaDto) {
        Hotel hotelBuscado = buscarHotelPorId(requestReservaDto.getBooking().getCodigoHotel());
        if (hotelBuscado == null){
            throw new HotelNoExisteException();
        }

        boolean hotelDisponible = hotelBuscado.estaDisponible(requestReservaDto.getBooking().getDesde(),requestReservaDto.getBooking().getHasta());
        if (!hotelDisponible){
            throw new HotelNoEstaDisponibleException();
        }
        if(reservaDao.existeReserva(hotelBuscado.getCodigoHotel(),requestReservaDto.getBooking().getDesde()
                ,requestReservaDto.getBooking().getHasta())){
            throw new YaExisteReservaEnPeriodoException();
        }
        Booking booking = crearBooking(requestReservaDto);
        reservaDao.agregar(booking);

        double monto = hotelBuscado.getPrecioNoche();
        double dias = booking.getDiasDiferencia();
        double total = INTERES * monto * dias;

        return new RespuestaReservaDto(requestReservaDto.getNombreUsuario(),
                monto, getInteres(), total, crearBookingRespuesta(requestReservaDto.getBooking()),
                new RespuestaDto(HttpStatus.OK.value(), "El proceso termino satisfactoriamente"));
    }

    private BookingDtoBase crearBookingRespuesta(BookingDto bookingDto){
        return new BookingDtoBase(bookingDto.getDesde(), bookingDto.getHasta(), bookingDto.getDestino(),
                bookingDto.getCodigoHotel(), bookingDto.getCantidadPersonas(), bookingDto.getTipoHabitacion(), bookingDto.getPersonas());
    }

    public Hotel buscarHotelPorId(String codigoHotel) {
        return hotelDao.getElementoPorId(codigoHotel);
    }


    //TODO: FEATURE: que devuelva una lista de todos los periodos en los que no hay reserva por hotel, es decir hotel: {datos_hotel} disponibles:[periodo1, periodo2, periodo3...]
    //TODO: HIPOTESIS: consideramos que devuelve todos los hoteles que tengan al menos un dia dentro del periodo fechaDesde..fechaHasta
    public List<HotelDto> getHoteles(String destination, LocalDate fechaDesde, LocalDate fechaHasta) {
        List<Hotel> hotelesEncontrados = hotelDao.getElementosPorPeriodo(destination, fechaDesde, fechaHasta);

        List<HotelDto> entradas_dtos = hotelesEncontrados.stream().map(this::crearHotelDto).collect(Collectors.toList());

        return entradas_dtos;
    }

    public List<HotelDto> getHoteles() {
        List<Hotel> hotelesEncontrados = hotelDao.getElementos();
        List<HotelDto> entradas_dtos = hotelesEncontrados.stream().map(this::crearHotelDto).collect(Collectors.toList());

        return entradas_dtos;
    }

    private Booking crearBooking(RequestReservaDto requestReservaDto) {
        return new Booking(requestReservaDto.getBooking().getCodigoHotel(),
                requestReservaDto.getBooking().getDesde(),requestReservaDto.getBooking().getHasta(),
                requestReservaDto.getBooking().getPersonas(),
                requestReservaDto.getBooking().getMetodoPago(),0);
    }

    private HotelDto crearHotelDto(Hotel hotel) {
        return new HotelDto(hotel.getCodigoHotel(), hotel.getNombre(), hotel.getLugarOCiudad(),
                hotel.getHabitacionTipo(), hotel.getPrecioNoche(), hotel.getDisponibleDesde(),
                hotel.getDisponibleHasta(), hotel.getReservado());
    }

    private double getInteres() {
        return (double) Math.round((INTERES - 1) * 100);
    }


    public RespuestaDto actualizar(HotelDto hotelDto) {
        if (hotelDao.getElementoPorId(hotelDto.getCodigoHotel()) == null){
            throw new HotelNoExisteException();
        }
        Hotel hotel = new Hotel(hotelDto.getCodigoHotel(),hotelDto.getNombre(),hotelDto.getLugarOCiudad(),hotelDto.getHabitacionTipo(),
        hotelDto.getPrecioNoche(),hotelDto.getDisponibleDesde(),hotelDto.getDisponibleHasta(),hotelDto.getReservado());
        hotelDao.putElemento(hotel);
        return new RespuestaDto(200, "hotel actualizado");
    }

    public RespuestaDto agregar(HotelDto hotelDto) {
        if (hotelDao.getElementoPorId(hotelDto.getCodigoHotel()) != null){
            throw new HotelYaExisteException();
        }
        Hotel hotel = new Hotel(hotelDto.getCodigoHotel(),hotelDto.getNombre(),hotelDto.getLugarOCiudad(),hotelDto.getHabitacionTipo(),
                hotelDto.getPrecioNoche(),hotelDto.getDisponibleDesde(),hotelDto.getDisponibleHasta(),hotelDto.getReservado());
        hotelDao.agregar(hotel);

        return new RespuestaDto(200, "Hotel agregado");

    }
}