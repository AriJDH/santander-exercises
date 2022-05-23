package com.example.showroom.service;

import com.example.showroom.dto.request.SaleRequestDTO;
import com.example.showroom.dto.response.SaleResponseDTO;
import com.example.showroom.model.Cloth;
import com.example.showroom.model.ClothSale;
import com.example.showroom.model.Sale;
import com.example.showroom.repository.SaleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    ModelMapper mapper = new ModelMapper();

    public SaleResponseDTO addSale(SaleRequestDTO saleRequestDTO) {
        Sale sale = mapper.map(saleRequestDTO, Sale.class);

        // TODO: el ejercicio en clase es medi }
        //  oconfuso pq quieren implementar cascade.persist con prendas que tienen una cantidad
        // ademas las ventas deberian tener una cantidad vendida de esa prenda
        // por lo tanto hacer un cascade.persist de cloth en medio de la venta no tiene mucho sentido
        // pero lo hago para entender como funciona el cascade.persist

        // obtengo la lista de clothes
        List<Cloth> clothes = saleRequestDTO.getClothesRequestDTOs()
                .stream()
                .map(clothRequestDTO -> mapper.map(clothRequestDTO, Cloth.class))
                .collect(Collectors.toList());

        // seteo el cloth a cada ClothSale
        List<ClothSale> clothSales = new ArrayList<>();
        ClothSale clothSale = null;
        for (Cloth cloth: clothes) {
            clothSale = new ClothSale(null, 1, cloth, null);
            clothSales.add(clothSale);
        }

        sale.setClothSales(clothSales);
        
        // TODO: funciona pero el sale_id queda en null
        // Moraleja: cascade.persist es un asco
        sale = saleRepository.save(sale);

        if(sale.getId() == null){
            throw new RuntimeException("Error al guardar venta, id generado es null");
        }

        return mapper.map(sale, SaleResponseDTO.class);
    }
}
