package com.desafioSpring.desafio_spring.service;

import com.desafioSpring.desafio_spring.dto.*;
import com.desafioSpring.desafio_spring.dto.request.PayloadHotelesDto;
import com.desafioSpring.desafio_spring.dto.response.ResponsePayloadHotelesDto;
import com.desafioSpring.desafio_spring.excepciones.HotelesException;
import com.desafioSpring.desafio_spring.mapper.HotelesMapper;
import com.desafioSpring.desafio_spring.dto.request.BookingDto;
import com.desafioSpring.desafio_spring.modelos.Hoteles;
import com.desafioSpring.desafio_spring.repo.HotelesDaoJsonImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Service("HotelesService")
public class HotelesService implements IntTurService<BookingDto, HotelesDto>, IntReservas<ResponsePayloadHotelesDto, PayloadHotelesDto> {

    //Constructores para la información traida del json y del mapper
    @Autowired
    private HotelesDaoJsonImp hotelesDaoJson;
    @Autowired
    private HotelesMapper hotelesMapper;

    //Metodo para ver todos los elementos guardados en hoteles
    @Override
    public List<HotelesDto> getElementos() {

        List<Hoteles> hoteles = hotelesDaoJson.getElementos();
        List<HotelesDto> hotelesDto = hoteles.stream().map(
                h -> hotelesMapper.toDto(h)).collect(Collectors.toList());
        return hotelesDto;
    }

    //Metodo para filtrar los hoteles por fecha
    @Override
    public List<HotelesDto> getElementosPorFecha(List<HotelesDto> listaHoteles, String desde, String hasta) {

        //convierte string a localdate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate desdeFecha = LocalDate.parse(desde, formatter);
        LocalDate hastaFecha = LocalDate.parse(hasta, formatter);;
        List<LocalDate> fechas = desdeFecha.datesUntil(hastaFecha.plusDays(1)).collect(Collectors.toList());

        //el filtro
        return listaHoteles.stream().filter(h ->
                    fechas.stream().anyMatch(f -> h.getDisponibleDesde().isEqual(f))
                            && fechas.stream().anyMatch(f -> h.getDisponibleHasta().isEqual(f))
        ).collect(Collectors.toList());
    }

    //Metodo para filtrar los hoteles por destino (trae la info del filtrado por fecha)
    @Override
    public List<HotelesDto> getElementosPorDestino(List<HotelesDto> listaHoteles, String destino) {

        return listaHoteles.stream().filter(h -> h.getLugarOciudad().equalsIgnoreCase(destino)
        ).collect(Collectors.toList());
    }

    //Metodo por filtrado por la disponibilidad del hotel (toma los datos traidos por el filtrado de destino)
    public List<HotelesDto> getElementosDisponibles(List<HotelesDto> listahoteles){

        listahoteles.stream().filter(d -> d.getReservado().equals("NO")).collect(Collectors.toList());
        //Excepción por si el hotel ya está alquilado
        if (listahoteles.isEmpty()) throw new HotelesException("El hotel no está disponible");
        return listahoteles;
    }

    //Metodo general que llama a los otros filtrados (va desde fecha, a destino a disponibilidad)
    @Override
    public List<HotelesDto> getElementosDisponiblesPorFechaYDestino(String desde, String hasta, String destino) {

        List<HotelesDto> porFecha = getElementosPorFecha(getElementos(),desde, hasta);
        return getElementosDisponibles(getElementosPorDestino(porFecha,destino));
    }

    //Metodo para tomar los datos del hotel que se pidió para alquilar desde el postMapping del controller
    //trae la info de ese hotel en particular y calcula cual será el precio por los días alquilados y el total (agregado impuesto)
    public void calculoYDevolucionDeDatos(ResponsePayloadHotelesDto respuesta){
        Hoteles hotel = hotelesDaoJson.buscarHotel(
                respuesta.getBookingDto().getHotelCode(),
                respuesta.getBookingDto().getRoomType());
        if (hotel.getReservado().equals("SI")) hotel = null;
        if (hotel == null) throw new HotelesException("El hotel no esta disponible");

        //Calcula los montos que se deberán pagar
        respuesta.setInterest(1.55);
        respuesta.setAmount(hotel.getPrecioNoche() * DAYS.between(respuesta.getBookingDto().getDateFrom(), respuesta.getBookingDto().getDateTo()));
        respuesta.setTotal(respuesta.getAmount() * respuesta.getInterest());

        //Trae la info del hotel desde el json
        hotelesDaoJson.reservarHotel(
                respuesta.getBookingDto().getHotelCode(),
                respuesta.getBookingDto().getRoomType(),
                respuesta.getBookingDto().getDateFrom(),
                respuesta.getBookingDto().getDateTo(),
                respuesta.getUserName(),
                respuesta.getTotal()
        );
    }

    //Metodo para registrar el alquiler de un cliente y todos los datos del hotel a una reserva
    public ResponsePayloadHotelesDto registrarYMostrarCliente(PayloadHotelesDto cliente) {
        ResponsePayloadHotelesDto reserva = new ResponsePayloadHotelesDto();
        StatusDto statusCode = new StatusDto(200, "El proceso termino satisfactoriamente");
        reserva.setUserName(cliente.getUserName());
        reserva.setBookingDto(hotelesMapper.responseBooking(cliente.getBooking()));
        calculoYDevolucionDeDatos(reserva);
        reserva.setStatusCode(statusCode);
        return reserva;
    }

}
