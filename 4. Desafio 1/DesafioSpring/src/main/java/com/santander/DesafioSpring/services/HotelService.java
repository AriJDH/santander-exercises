package com.santander.DesafioSpring.services;

import com.santander.DesafioSpring.dtos.ResponseStatusDTO;
import com.santander.DesafioSpring.dtos.request.RequestBookingDTO;
import com.santander.DesafioSpring.dtos.request.RequestHotelFechaDestinoDTO;
import com.santander.DesafioSpring.dtos.request.RequestHotelFechaDestinoDecoyDTO;
import com.santander.DesafioSpring.dtos.response.ResponseBookingDTO;
import com.santander.DesafioSpring.dtos.response.ResponseHotelDTO;
import com.santander.DesafioSpring.exceptions.HotelFechaException;
import com.santander.DesafioSpring.exceptions.HotelNotFoundException;
import com.santander.DesafioSpring.exceptions.HotelPeriodOutOfBoundsException;
import com.santander.DesafioSpring.models.Hotel;
import com.santander.DesafioSpring.repo.HotelDAOImpl;
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

        List<Hotel>hoteles=hotelDAO.obtenerElementos();
        List<ResponseHotelDTO>hotelDTOList=new LinkedList<>();
        for (Hotel hotel : hoteles) {
            hotelDTOList.add(new ResponseHotelDTO(hotel));
        }
        return hotelDTOList;
    }

    @ResponseStatus(value = HttpStatus.OK)
    public ResponseBookingDTO makeReservation(RequestBookingDTO requestBooking) {
        Hotel hotelEncontrado = hotelDAO.buscarElemento(requestBooking.getBooking().getHotelCode());
        if(hotelEncontrado == null) {
            throw new HotelNotFoundException("No existe un hotel con el código solicitado");
        }
        else if (! hotelEncontrado.isAvailable(requestBooking.getBooking().getDateFrom(), requestBooking.getBooking().getDateTo())){
            throw new HotelPeriodOutOfBoundsException("El hotel solicitado no se encuentra disponible en el período indicado");
        }

        // cambia el boolean
        hotelDAO.confirmarReserva(hotelEncontrado);
        return new ResponseBookingDTO(requestBooking, hotelEncontrado, new ResponseStatusDTO(HttpStatus.OK.value(), "La reserva fue hecha con éxito"));
    }

    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseHotelDTO> obtenerHotelesPorFechaDestino(RequestHotelFechaDestinoDecoyDTO hotelDecoyDto) {
        try {
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            RequestHotelFechaDestinoDTO hotelDto = new RequestHotelFechaDestinoDTO(hotelDecoyDto.getDestination(),
                    //Hago el LocalDate aca para que salte el error de MismatchException aca y no en el controlador
                    LocalDate.parse(hotelDecoyDto.getDateFrom(),formatter),
                    LocalDate.parse(hotelDecoyDto.getDateTo(),formatter));

            List<Hotel> hoteles = hotelDAO.obtenerElementos();
            List<ResponseHotelDTO> hotelDTOList = new LinkedList<>();
            //Creo un collator y lo seteo en primary para comparar nombres sin importarme las tildes o si esta en mayuscula o minuscula
            Collator collator= Collator.getInstance();
            collator.setStrength(Collator.PRIMARY);
            if(hotelDto.getDateFrom().isAfter(hotelDto.getDateTo())){
                throw new HotelFechaException("La fecha ingresada es invalida");
            }
            for (Hotel hotel : hoteles) {
                if(     //verifico si la reserva esta tomada
                        hotel.isReserved()==false &&
                                //verifico si el nombre del destino coincide
                                collator.equals(hotel.getDestination(),hotelDto.getDestination()) &&
                                //verifico si la fecha desde de la reserva coincide con la fecha desde disponible del hotel
                                hotelDto.getDateFrom().isAfter(hotel.getDateFrom().minusDays(1))&&
                                //verifico si la fecha hasta de lareserva coincide con la fecha hasta disponible del hotel
                                hotelDto.getDateTo().isBefore(hotel.getDateTo().plusDays(1)))
                {
                    hotelDTOList.add(new ResponseHotelDTO(hotel));
                }
            }
            if(hotelDTOList.isEmpty()){
                throw new HotelNotFoundException("No hay hoteles para ese destino en las fechas ingresadas");
            }
            return hotelDTOList;
        }
        catch (DateTimeParseException e){
            throw new HotelFechaException("La fecha ingresada es invalida, porfavor ingrese una fecha con el siguiente formato dd/mm/yyyy");
        }
    }

}