package com.bootcamp.C23P1.services;

import com.bootcamp.C23P1.dtos.AlumnoDTO;
import com.bootcamp.C23P1.dtos.CreateAlumnoRequestDTO;
import com.bootcamp.C23P1.dtos.CreateAlumnoResponseDTO;
import com.bootcamp.C23P1.dtos.SorteoResponseDTO;
import com.bootcamp.C23P1.models.Alumno;
import com.bootcamp.C23P1.repositories.AlumnoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    ModelMapper modelMapper = new ModelMapper();

    public CreateAlumnoResponseDTO createAlumno(CreateAlumnoRequestDTO createAlumnoRequestDTO) {

        Alumno alumno = modelMapper.map(createAlumnoRequestDTO, Alumno.class);
        alumnoRepository.save(alumno);

        CreateAlumnoResponseDTO createAlumnoResponseDTO = new CreateAlumnoResponseDTO();

        if(alumnoRepository.existsById(alumno.getId())) {

            createAlumnoResponseDTO.setMessage("Alumno creado correctamente.");
            createAlumnoResponseDTO.setCode(HttpStatus.CREATED.value());
            createAlumnoResponseDTO.setAlumnoDTO(modelMapper.map(alumno, AlumnoDTO.class));

            return createAlumnoResponseDTO;
        }

        createAlumnoResponseDTO.setMessage("Error al crear el alumno.");
        createAlumnoResponseDTO.setCode(HttpStatus.BAD_REQUEST.value());
        return createAlumnoResponseDTO;
    }

    public List<AlumnoDTO> getAllAlumnos() {

        List<AlumnoDTO> listaAlumnosDTO = new ArrayList<>();

        alumnoRepository.findAll().stream().map(alumno ->
                listaAlumnosDTO.add(
                    modelMapper.map(alumno, AlumnoDTO.class))
                ).collect(Collectors.toList());

        return listaAlumnosDTO;
    }

    public SorteoResponseDTO sorteoOrden() {

        SorteoResponseDTO sorteoResponseDTO = new SorteoResponseDTO();

        Set<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();

        for(int i=1; i < 6; i++){
            boolean sorteado = false;

            do {

                sorteado = false;

                int numeroSorteado = random.nextInt(15);
                if (numeroSorteado == 0){
                    numeroSorteado = numeroSorteado + 1;
                }


               for (Integer num: numerosSorteados) {
                   if(num == numeroSorteado){
                       sorteado = true;
                   }
               }

                if (sorteado == false){
                    numerosSorteados.add(numeroSorteado);
                }
            } while(sorteado == true);
        }


        for (Integer numeroSorteado: numerosSorteados) {

            System.out.println("Numero: " + numeroSorteado);
            System.out.println(alumnoRepository.findById(numeroSorteado).get());


            sorteoResponseDTO.getAlumnoDTOList().add(
              modelMapper.map(alumnoRepository.findById(numeroSorteado).get(), AlumnoDTO.class)
            );
        }

        return sorteoResponseDTO;
    }
}
