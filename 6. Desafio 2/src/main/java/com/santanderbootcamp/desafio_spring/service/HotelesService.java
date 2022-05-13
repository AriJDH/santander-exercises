package com.santanderbootcamp.desafio_spring.service;

import com.santanderbootcamp.desafio_spring.dto.HotelesDto;
import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadHotelesDto;
import com.santanderbootcamp.desafio_spring.excepciones.FechasNoValidasException;
import com.santanderbootcamp.desafio_spring.excepciones.HotelesException;
import com.santanderbootcamp.desafio_spring.mapper.HotelesMapper;
import com.santanderbootcamp.desafio_spring.modelos.Hoteles;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Service("HotelesService")
public class HotelesService implements IntTurService<HotelesDto>, IntReservas<ResponsePayloadHotelesDto, PayloadHotelesDto> {

    //Constructores para la información traida del json y del mapper
    @Autowired
    private Dao<String, Hoteles> hotelesDaoJson;
    @Autowired
    private HotelesMapper hotelesMapper;

    //Metodo para ver todos los elementos guardados en hoteles
    @Override
    public List<HotelesDto> getElementos() {

        List<Hoteles> hoteles = hotelesDaoJson.getElementos();
        return hoteles.stream().map(
                h -> hotelesMapper.toDto(h)).collect(Collectors.toList());
    }

    //Metodo general que llama a los otros filtrados (va desde fecha, a destino a disponibilidad)
    @Override
    public List<HotelesDto> getElementosDisponiblesPorFechaYDestino(String desde, String hasta, String destino) {
        List<HotelesDto> elementos = this.getElementos();
        List<HotelesDto> porFecha = getElementosPorFecha(elementos,desde, hasta);
        if (porFecha.isEmpty()) throw new HotelesException("No hay hoteles disponibles en la fecha dada");
        List<HotelesDto> porDestino = getElementosPorDestino(porFecha, destino);
        List<HotelesDto> listaHoteles = getElementosDisponibles(porDestino);
        return listaHoteles;
    }

    //Metodo para filtrar los hoteles por fecha
    @Override
    public List<HotelesDto> getElementosPorFecha(List<HotelesDto> listaHoteles, String desde, String hasta) {

        //convierte string a localdate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate desdeFecha = LocalDate.parse(desde, formatter);
        LocalDate hastaFecha = LocalDate.parse(hasta, formatter);
        if(hastaFecha.isBefore(desdeFecha) || hastaFecha.equals(desdeFecha)) throw new FechasNoValidasException("La fecha de entrada debe ser mayor a la de salida");
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
        List<HotelesDto> hotelesDtoList = listaHoteles.stream().filter(h -> h.getLugarOciudad().equalsIgnoreCase(destino)
        ).collect(Collectors.toList());
        if (hotelesDtoList.isEmpty()) throw new HotelesException("El destino no existe");
        return hotelesDtoList;
    }
    //Metodo por filtrado por la disponibilidad del hotel (toma los datos traidos por el filtrado de destino)

    public List<HotelesDto> getElementosDisponibles(List<HotelesDto> listahoteles){

        //Excepción por si el hotel ya está alquilado
        return listahoteles.stream().filter(d -> d.getReservado().equals("NO")).collect(Collectors.toList());
    }



    //Metodo para tomar los datos del hotel que se pidió para alquilar desde el postMapping del controller
    //trae la info de ese hotel en particular y calcula cual será el precio por los días alquilados y el total (agregado impuesto)
    public void calculoYDevolucionDeDatos(ResponsePayloadHotelesDto respuesta, int nroCuotas){
        Hoteles hotel = hotelesDaoJson.buscar(
                respuesta.getBooking().getHotelCode(),
                respuesta.getBooking().getRoomType());
        if (hotel == null) throw new HotelesException("Se debe cargar la información del hotel");
        if (hotel.getReservado().equals("SI")) throw new HotelesException("El hotel no está disponible");
        if(!hotel.getLugarOCiudad().equals(respuesta.getBooking().getDestination()))
            throw new HotelesException("No hay un hotel registrado en ese lugar.");

        //Calcula los montos que se deberán pagar
        respuesta.setInterest(calcularInteres(nroCuotas));
        respuesta.setAmount(hotel.getPrecioNoche() * DAYS.between(respuesta.getBooking().getDateFrom(), respuesta.getBooking().getDateTo()));
        respuesta.setTotal(respuesta.getAmount() * respuesta.getInterest());

        //Trae la info del hotel desde el json
        hotelesDaoJson.reservar(
                respuesta.getBooking().getHotelCode(),
                respuesta.getBooking().getRoomType()
        );
    }

    //Calculo de interes segun las cuotas utilizadas
    private Double calcularInteres (int cuotas){
        double interes;
        switch (cuotas) {
            case 0:
                interes = 1;
                break;
            case 1:
            case 2:
            case 3:
                interes = 1.05;
                break;
            case 4:
            case 5:
            case 6:
                interes = 1.1;
                break;
            default:
                interes = 1.20;
                break;

        }
        return interes;
    }

    //Metodo para registrar el alquiler de un cliente y todos los datos del hotel a una reserva
    public ResponsePayloadHotelesDto registrarYMostrarCliente(PayloadHotelesDto cliente) {
        ResponsePayloadHotelesDto reserva = new ResponsePayloadHotelesDto();
        StatusDto statusCode = new StatusDto(200, "El proceso termino satisfactoriamente");
        reserva.setUserName(cliente.getUserName());
        reserva.setBooking(hotelesMapper.responseBooking(cliente.getBooking()));
        calculoYDevolucionDeDatos(reserva, cliente.getBooking().getPaymentMethod().getDues());
        reserva.setStatusCode(statusCode);
        return reserva;
    }

}
