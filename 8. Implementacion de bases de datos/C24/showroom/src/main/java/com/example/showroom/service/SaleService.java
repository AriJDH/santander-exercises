package com.example.showroom.service;

import com.example.showroom.dto.request.SaleRequestDTO;
import com.example.showroom.dto.response.SaleResponseDTO;
import com.example.showroom.model.Sale;
import com.example.showroom.repository.SaleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    ModelMapper mapper = new ModelMapper();

    public SaleResponseDTO addSale(SaleRequestDTO saleRequestDTO) {
        Sale sale = mapper.map(saleRequestDTO, Sale.class);

        sale = saleRepository.save(sale);

        if(sale.getId() == null){
            throw new RuntimeException("Error al guardar venta, id generado es null");
        }

        return mapper.map(sale, SaleResponseDTO.class);
    }
}
