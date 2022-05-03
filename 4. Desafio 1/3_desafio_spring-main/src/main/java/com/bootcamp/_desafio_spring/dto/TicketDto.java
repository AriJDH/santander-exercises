package com.bootcamp._desafio_spring.dto;

import lombok.Getter;
import java.time.LocalDate;
import java.util.List;

@Getter
public class TicketDto extends TicketDtoBase {
    private final MetodoPagoDto metodoPago;

    public TicketDto(LocalDate desde, LocalDate hasta, String origen, String destino, String codigoVuelo, int asientos, String tipoAsiento, List<PersonaDto> personas, MetodoPagoDto metodoPago) {
        super(desde, hasta, origen, destino, codigoVuelo, asientos, tipoAsiento, personas);
        this.metodoPago = metodoPago;
    }

    public MetodoPagoDto getMetodoPago() {
        return metodoPago;
    }
}

