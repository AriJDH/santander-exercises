package com.bootcamp._desafio_spring.service;

import com.bootcamp._desafio_spring.dto.*;
import com.bootcamp._desafio_spring.excepciones.VueloNoExisteException;
import com.bootcamp._desafio_spring.excepciones.VueloYaExisteException;
import com.bootcamp._desafio_spring.model.Ticket;
import com.bootcamp._desafio_spring.model.Vuelo;
import com.bootcamp._desafio_spring.repo.VueloDao;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VueloService {
    private final double INTERES = 1.21;

    private VueloDao vueloDao = new VueloDao();

    public RespuestaReservaVueloDto reservar(RequestReservaVueloDto requestReservaVueloDto) {

        TicketDto ticketDto = requestReservaVueloDto.getTicket();
        Vuelo vueloBuscado = buscarVuelos(ticketDto.getDestino(), ticketDto.getOrigen(), ticketDto.getDesde());


        Ticket ticket = crearTicket(requestReservaVueloDto);
        double monto = vueloBuscado.getPrecioPersona() * ticket.cantidadPasajeros();
        double total = INTERES * monto;
        return new RespuestaReservaVueloDto(requestReservaVueloDto.getNombreUsuario(),
                monto, (double) Math.round((INTERES - 1) * 100), total, crearTicketRespuesta(requestReservaVueloDto.getTicket()),
                new RespuestaDto(HttpStatus.OK.value(), "El proceso termino satisfactoriamente"));
    }

    private Vuelo buscarVuelos(String destino, String origen, LocalDate fechaIda) {
        return vueloDao.buscarVuelos(destino, origen, fechaIda);
    }

    private TicketDtoBase crearTicketRespuesta(TicketDto ticketDto){
        return new TicketDtoBase(ticketDto.getDesde(), ticketDto.getHasta(), ticketDto.getOrigen(), ticketDto.getDestino(),
                ticketDto.getCodigoVuelo(), ticketDto.getAsientos(), ticketDto.getTipoAsiento(), ticketDto.getPersonas());
    }

    private Ticket crearTicket(RequestReservaVueloDto requestReservaVueloDto) {
        return new Ticket(requestReservaVueloDto.getTicket().getCodigoVuelo(),
                requestReservaVueloDto.getTicket().getDesde(), requestReservaVueloDto.getTicket().getHasta(),
                requestReservaVueloDto.getTicket().getPersonas(), requestReservaVueloDto.getTicket().getMetodoPago()
        );
    }

    public List<VueloDto> getVuelos() {
        List<Vuelo> vuelosEncontrados = vueloDao.getElementos();
        List<VueloDto> vuelosDtos = vuelosEncontrados.stream().map(
                vuelo -> new VueloDto(vuelo.getNroVuelo(), vuelo.getFechaIda(), vuelo.getFechaVuelta(), vuelo.getPrecioPersona(), vuelo.getOrigen(), vuelo.getDestino(), vuelo.getTipoAsiento())
        ).collect(Collectors.toList());
        return vuelosDtos;
    }


    public List<VueloDto> obtenerVuelos(String origen, String destino, LocalDate fechaDesde, LocalDate fechaHasta) {
        List<Vuelo> vuelosEncontrados = vueloDao.obtenerVuelosDisponiblesOptimizado(origen, destino, fechaDesde, fechaHasta);
        List<VueloDto> vuelosDtos = vuelosEncontrados.stream().map(
                vuelo -> new VueloDto(vuelo.getNroVuelo(), vuelo.getFechaIda(),
                        vuelo.getFechaVuelta(), vuelo.getPrecioPersona(),
                        vuelo.getOrigen(), vuelo.getDestino(), vuelo.getTipoAsiento())
        ).collect(Collectors.toList());
        return vuelosDtos;
    }

    public RespuestaDto agregar(VueloDto vueloDto) {
        if (vueloDao.getElementoPorId(vueloDto.getNroVuelo()) != null){
            throw new VueloYaExisteException();
        }
        Vuelo vuelo = crearVuelo(vueloDto);
        vueloDao.agregar(vuelo);

        return new RespuestaDto(200, "agregado vuelo");
    }

    public RespuestaDto actualizar(VueloDto vueloDto) {
        if (vueloDao.getElementoPorId(vueloDto.getNroVuelo()) == null){
            throw new VueloNoExisteException();
        }
        Vuelo vuelo = crearVuelo(vueloDto);
        vueloDao.putElemento(vuelo);
        return new RespuestaDto(200, "vuelo actualizado");
    }

    private Vuelo crearVuelo(VueloDto vueloDto) {
        return new Vuelo(vueloDto.getNroVuelo(), vueloDto.getFechaIda(), vueloDto.getFechaVuelta(),
                vueloDto.getPrecioPersona(), vueloDto.getOrigen(), vueloDto.getDestino(), vueloDto.getTipoAsiento());
    }

}
