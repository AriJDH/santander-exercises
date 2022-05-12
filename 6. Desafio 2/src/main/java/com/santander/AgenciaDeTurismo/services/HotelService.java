package com.santander.AgenciaDeTurismo.services;

import com.santander.AgenciaDeTurismo.dtos.ResponseStatusDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestHotelFechaDestinoDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestHotelFechaDestinoDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.exceptions.HotelDestinationNotFoundException;
import com.santander.AgenciaDeTurismo.exceptions.HotelFechaException;
import com.santander.AgenciaDeTurismo.exceptions.HotelNotFoundException;
import com.santander.AgenciaDeTurismo.exceptions.HotelPeriodOutOfBoundsException;
import com.santander.AgenciaDeTurismo.models.Hotel;
import com.santander.AgenciaDeTurismo.repo.HotelDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.Collator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

@Service(value = "HotelService")
public class HotelService implements IService<ResponseHotelDTO> {

    @Autowired
    @Qualifier(value = "HotelDAOImpl")
    HotelDAOImpl hotelDAO;

    @Override
    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseHotelDTO> obtenerElementos() {

        List<Hotel> hoteles = hotelDAO.obtenerElementos();
        if(hoteles == null){
            throw new HotelNotFoundException("No existe registro de hoteles");
        }
        else {
            List<ResponseHotelDTO> hotelDTOList = new LinkedList<>();
            for (Hotel hotel : hoteles) {
                hotelDTOList.add(new ResponseHotelDTO(hotel));
            }
            return hotelDTOList;
        }
    }

    @ResponseStatus(value = HttpStatus.OK)
    public ResponseBookingDTO makeReservation(RequestBookingDTO requestBooking) {
        Hotel hotelEncontrado = hotelDAO.buscarElemento(requestBooking.getBooking().getHotelCode());
        if (hotelEncontrado == null) {
            throw new HotelNotFoundException("No existe un hotel con el codigo solicitado");
        } else if (!hotelEncontrado.getDestination().equals(requestBooking.getBooking().getDestination())){
            throw new HotelNotFoundException("No existe un hotel con el destino solicitado");
        } else if (!hotelEncontrado.isAvailable(requestBooking.getBooking().getDateFrom(), requestBooking.getBooking().getDateTo())) {
            throw new HotelPeriodOutOfBoundsException("El hotel solicitado no se encuentra disponible en el periodo indicado");

        }

        double interest = requestBooking.getBooking().getPaymentMethod().getType().equals("DEBIT") ? 0 : (Math.ceil(requestBooking.getBooking().getPaymentMethod().getDues() / 3)) * 5.0;
        // cambia el boolean
        hotelDAO.confirmarReserva(hotelEncontrado);
        return new ResponseBookingDTO(requestBooking,interest, hotelEncontrado, new ResponseStatusDTO(HttpStatus.OK.value(), "La reserva fue hecha con exito"));
    }




    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseHotelDTO> obtenerHotelesPorFechaDestino(RequestHotelFechaDestinoDecoyDTO hotelDecoyDto) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            RequestHotelFechaDestinoDTO hotelDto = new RequestHotelFechaDestinoDTO(hotelDecoyDto.getDestination(),
                    //Hago el LocalDate aca para que salte el error de MismatchException aca y no en el controlador
                    LocalDate.parse(hotelDecoyDto.getDateFrom(), formatter),
                    LocalDate.parse(hotelDecoyDto.getDateTo(), formatter));
            //Creo un collator y lo seteo en primary para comparar nombres sin importarme las tildes o si esta en mayuscula o minuscula
            Collator collator = Collator.getInstance();
            collator.setStrength(Collator.PRIMARY);
            //Checkeo si existe el destino antes pasandole el collator para que filtre sin importar los tildes
            if (!hotelDAO.destinationExists(hotelDto.getDestination(), collator)) {
                throw new HotelDestinationNotFoundException("El destino elegido no existe");
            }
            List<Hotel> hoteles = hotelDAO.obtenerElementos();
            List<ResponseHotelDTO> hotelDTOList = new LinkedList<>();

            if (hotelDto.getDateFrom().isAfter(hotelDto.getDateTo())) {
                throw new HotelFechaException("La fecha de salida debe ser mayor a la de entrada");
            }
            for (Hotel hotel : hoteles) {
                if (     //verifico si alguien tomo la reserva
                        hotel.isReserved() == false &&
                                //verifico si el nombre del destino coincide
                                collator.equals(hotel.getDestination(), hotelDto.getDestination()) &&
                                //verifico si la fecha desde de la reserva coincide con la fecha desde disponible del hotel
                                hotelDto.getDateFrom().isAfter(hotel.getDateFrom().minusDays(1)) &&
                                //verifico si la fecha hasta de lareserva coincide con la fecha hasta disponible del hotel
                                hotelDto.getDateTo().isBefore(hotel.getDateTo().plusDays(1))) {
                    hotelDTOList.add(new ResponseHotelDTO(hotel));
                }
            }
            if (hotelDTOList.isEmpty()) {
                throw new HotelNotFoundException("No hay hoteles para ese destino en las fechas ingresadas");
            }
            return hotelDTOList;
        } catch (DateTimeParseException e) {
            throw new HotelFechaException("La fecha ingresada es invalida, porfavor ingrese una fecha con el siguiente formato dd/mm/yyyy");
        }
    }


}
