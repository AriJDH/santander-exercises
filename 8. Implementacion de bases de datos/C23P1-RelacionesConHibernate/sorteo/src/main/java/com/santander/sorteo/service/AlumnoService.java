package com.santander.sorteo.service;

import com.santander.sorteo.dto.request.AlumnoResquestDTO;
import com.santander.sorteo.dto.response.AlumnoResponseDTO;
import com.santander.sorteo.dto.response.SuccessDTO;
import com.santander.sorteo.entity.Alumno;
import com.santander.sorteo.repository.IAlumnoRepository;
import com.santander.sorteo.repository.ITemaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService {
    @Autowired
    IAlumnoRepository alumnoRepository;

    @Autowired
    ITemaRepository temaRepository;

    ModelMapper modelMapper = new ModelMapper();

    //Primero debemos asegurarnos que exista el tema para luego asociarlo al alumno
    public SuccessDTO newStudents (AlumnoResquestDTO alumnoResquestDTO) {
        //verifico que el idTema del alumno ingresado exista
        Integer idTema = alumnoResquestDTO.getTema().getId();
        if (temaRepository.findById(idTema).isEmpty()) {
            throw new RuntimeException();
        }
        Alumno alumno = modelMapper.map(alumnoResquestDTO, Alumno.class);
        alumnoRepository.save(alumno);
        SuccessDTO successDTO = new SuccessDTO(HttpStatus.CREATED.value(), "El alumno se creo correctamente.");
        return successDTO;
    }

    public List<AlumnoResponseDTO> getStudents () {
        List<Alumno> listStudents = alumnoRepository.findAll();
        return listStudents.stream().map(student->modelMapper.map(student,AlumnoResponseDTO.class)).collect(Collectors.toList());
    }

    public List<AlumnoResponseDTO> drawStudents () {
        List<Alumno> allStudents = alumnoRepository.findAll();
        //genero 5 numeros aleatorios sin repetir
        List<Integer> listNumbers = chooseFiveNumbers();

        List<Alumno> students = new ArrayList<>();
        for (int i=0; i < listNumbers.size(); i++) {
            Integer idRandom = listNumbers.get(i);
            for (int j=0; j < allStudents.size(); j++){
                if (idRandom == allStudents.get(j).getId())
                    students.add(allStudents.get(j));
            }
        }
        return students.stream().map(alumno -> modelMapper.map(alumno,AlumnoResponseDTO.class)).collect(Collectors.toList());
    }

    //Crea una lista de numeros y selecciona 5 numeros sin repetir aleatoriamente, devuelve una lista de esos numeros
    public List<Integer> chooseFiveNumbers() {
        List<Integer> listNumbers = new ArrayList<>();
        Integer num = (int)Math.floor(Math.random()*(15-1)+1);
        listNumbers.add(num);
        for (int i = 0; i < 4; i++) {
            num = (int)Math.floor(Math.random()*(15-1)+1);
            //mientras sea num repetido entra
            while (isNumRepeat(num, listNumbers)) {
                num = (int)Math.floor(Math.random()*(15-1)+1);
            }
            listNumbers.add(num);
        }
        return listNumbers;
    }
    //Recibo un numero y una lista de numeros, si el numero ya esta en la lista devuelve true, en caso contrario false
    public boolean isNumRepeat (Integer num, List<Integer> numeros) {
        for (int i=0; i < numeros.size(); i++) {
            if (num == numeros.get(i))
                return true;
        }
        return false;
    }

}
