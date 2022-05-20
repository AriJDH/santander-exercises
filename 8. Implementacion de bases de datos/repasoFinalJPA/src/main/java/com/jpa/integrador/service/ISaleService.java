package com.jpa.integrador.service;

import com.jpa.integrador.dto.request.SaleRequestDTO;
import com.jpa.integrador.dto.response.ClothesListResponseDTO;
import com.jpa.integrador.dto.response.SaleListResponseDTO;
import com.jpa.integrador.dto.response.SaleResponseDTO;

import java.time.LocalDate;
import java.util.List;

public interface ISaleService {

    Boolean addSale(SaleRequestDTO saleRequestDTO);

    List<SaleListResponseDTO> findAllSales();

    SaleResponseDTO findOneSale(Integer id);

    Boolean updateSale(SaleRequestDTO saleRequestDTO);

    Boolean deleteSale(Integer id);

    SaleListResponseDTO searchSaleByDate(LocalDate date);

    ClothesListResponseDTO searchClothesBySaleId(Integer id);
}
