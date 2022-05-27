package com.jpa.integrador.service;

import com.jpa.integrador.dto.request.ClothRequestDTO;
import com.jpa.integrador.dto.response.ClothesListResponseDTO;
import com.jpa.integrador.dto.response.ClothesResponseDTO;
import com.jpa.integrador.dto.response.SaleListResponseDTO;
import com.jpa.integrador.dto.response.SaleResponseDTO;

import java.util.List;

public interface IClothService {

    Boolean addCloth(ClothRequestDTO clothRequestDTO);

    ClothesListResponseDTO findAllCloth();

    ClothesResponseDTO findOneCloth(Integer id);

    Boolean updateCloth(Integer code, ClothRequestDTO clothRequestDTO);

    Boolean deleteCloth(Integer id);

    ClothesListResponseDTO searchSaleBySize(String size);

    ClothesListResponseDTO searchClothesByName(String name);
}
