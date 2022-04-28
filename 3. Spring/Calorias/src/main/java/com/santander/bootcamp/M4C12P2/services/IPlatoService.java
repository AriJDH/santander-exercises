package com.santander.bootcamp.M4C12P2.services;

import com.santander.bootcamp.M4C12P2.DTO.IngredienteCaloriasDTO;
import com.santander.bootcamp.M4C12P2.DTO.PlatoDTO;

import java.util.List;

public interface IPlatoService {

    public void agregarPlato(PlatoDTO platoDTO);

    public PlatoDTO obtenerPlato(String nombrePlato);

    public double calcularCalorias(String nombrePlato);

    public List<IngredienteCaloriasDTO> obtenerCaloriasIngredientes(String nombrePlato);

    public IngredienteCaloriasDTO obtenerIngredientesMasCalorico(String nombrePlato);

}
