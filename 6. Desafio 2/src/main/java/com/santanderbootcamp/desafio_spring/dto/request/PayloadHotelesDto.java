package com.santanderbootcamp.desafio_spring.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PayloadHotelesDto {

    //se utiliza para cargar un payloads

    @NotBlank(message = "El campo nombre de usuario no puede estar vacío")
    @Email(message = "Por favor, ingrese un mail válido")
    private String userName;
    private @Valid BookingDto booking;

}
