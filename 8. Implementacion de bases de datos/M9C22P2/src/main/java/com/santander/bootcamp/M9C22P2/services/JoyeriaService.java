package com.santander.bootcamp.M9C22P2.services;

import com.santander.bootcamp.M9C22P2.dtos.Request.RequestJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.Response.ResponseJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.Response.ResponseUpdateJoyaDTO;
import com.santander.bootcamp.M9C22P2.dtos.SuccessDTO;
import com.santander.bootcamp.M9C22P2.entities.Joya;
import com.santander.bootcamp.M9C22P2.repositories.IJoyeriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(value = "JoyeriaService")
public class JoyeriaService {

    @Autowired
    private IJoyeriaRepository joyeriaRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    public SuccessDTO registrarJoya (RequestJoyaDTO requestJoyaDTO) {
        requestJoyaDTO.setVentaONo(true);

        Joya joyaGuardada = this.joyeriaRepository.save(modelMapper.map(requestJoyaDTO, Joya.class));

        if (joyaGuardada == null) throw new RuntimeException("Se produjo un error al guardar");

        return new SuccessDTO(
                HttpStatus.CREATED.value(),
                String.format("Se ha guardado la joya %s con éxito", joyaGuardada.getNro_identificatorio().toString())
        );
    }

    public List<ResponseJoyaDTO> listarJoyas () {
        return this.joyeriaRepository.findAll().stream()
                .filter(joya -> joya.getVentaONo())
                .map(joya -> modelMapper.map(joya, ResponseJoyaDTO.class))
                .collect(Collectors.toList());
    }

    public SuccessDTO eliminarJoya (Long id) {
        Joya joyaAModificar = this.joyeriaRepository.findById(id).orElseThrow(
                () -> new RuntimeException(String.format("No Existe una joya registrada con el id %s", id.toString()))
        );

        joyaAModificar.setVentaONo(false);

        Joya joyaGuardada = this.joyeriaRepository.save(joyaAModificar);

        if (joyaGuardada == null) throw new RuntimeException("Se produjo un error al guardar los cambios");

        return new SuccessDTO(
                HttpStatus.OK.value(),
                String.format("Se ha eliminado la joya %s con éxito", joyaGuardada.getNro_identificatorio().toString())
        );
    }

    public ResponseUpdateJoyaDTO modificarJoya (Long id, RequestJoyaDTO requestJoyaDTO) {
        Joya joyaModificada = modelMapper.map(requestJoyaDTO, Joya.class);
        joyaModificada.setNro_identificatorio(id);

        Joya joyaGuardada = this.joyeriaRepository.save(joyaModificada);

        if (joyaGuardada == null) throw new RuntimeException("Se produjo un error al guardar los cambios");

        return new ResponseUpdateJoyaDTO(
                HttpStatus.OK.value(),
                modelMapper.map(joyaGuardada, ResponseJoyaDTO.class)
        );
    }

}
