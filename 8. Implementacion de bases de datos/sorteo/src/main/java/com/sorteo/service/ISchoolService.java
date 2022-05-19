package com.sorteo.service;


import com.sorteo.dto.AlumnoDto;
import com.sorteo.dto.SorteoDto;
import com.sorteo.dto.TemaDto;

import java.util.List;

public interface ISchoolService {

    public List<AlumnoDto> getAlumnos();
    public List<TemaDto> getTemas();
    public List<SorteoDto> getSorteo();
    public void saveTema (TemaDto temaDto);
    public void saveAlummno (AlumnoDto alumnoDto);
}
