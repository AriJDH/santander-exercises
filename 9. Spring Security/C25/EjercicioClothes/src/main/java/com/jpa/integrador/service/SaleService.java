package com.jpa.integrador.service;

import com.jpa.integrador.dto.request.ClothRequestDTO;
import com.jpa.integrador.dto.request.SaleRequestDTO;
import com.jpa.integrador.dto.response.ClothesListResponseDTO;
import com.jpa.integrador.dto.response.ClothesResponseDTO;
import com.jpa.integrador.dto.response.SaleListResponseDTO;
import com.jpa.integrador.dto.response.SaleResponseDTO;
import com.jpa.integrador.entity.Cloth;
import com.jpa.integrador.entity.Sale;
import com.jpa.integrador.repository.SaleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService implements ISaleService {

    @Autowired
    SaleRepository saleRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public Boolean addSale(SaleRequestDTO saleRequestDTO) {
        Sale sale = mapper.map(saleRequestDTO, Sale.class);

        sale.setCloth(saleRequestDTO.getCloth().stream().map(
                cloth -> mapper.map(cloth, Cloth.class)
        ).collect(Collectors.toList())
        );

        sale = saleRepository.save(
                sale
        );
        return sale.getId() != null;
    }

    @Override
    public List<SaleListResponseDTO> findAllSales() {
        return null;
    }

    @Override
    public SaleResponseDTO findOneSale(Integer id) {
        return null;
    }

    @Override
    public Boolean updateSale(SaleRequestDTO saleRequestDTO) {
        return null;
    }

    @Override
    public Boolean deleteSale(Integer id) {
        return null;
    }

    @Override
    public SaleListResponseDTO searchSaleByDate(LocalDate date) {
        List<Sale> list = saleRepository.findSaleByDateEquals(date);
        return new SaleListResponseDTO(
                list.stream().map(
                        sale -> mapper.map(sale, SaleResponseDTO.class)
                )
                        .collect(Collectors.toList())
        );
    }

    @Override
    public ClothesListResponseDTO searchClothesBySaleId(Integer id) {
        List<Cloth> cloths = saleRepository.findClothBySaleId(id);
        return new ClothesListResponseDTO(
                cloths.stream().map(
                        cloth -> mapper.map(cloth, ClothesResponseDTO.class)
                )
                        .collect(Collectors.toList())
        );
    }
}
