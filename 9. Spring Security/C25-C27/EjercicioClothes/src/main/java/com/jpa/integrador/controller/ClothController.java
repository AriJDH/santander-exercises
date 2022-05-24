package com.jpa.integrador.controller;

import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.ClothRequestDTO;
import com.jpa.integrador.dto.response.ClothesListResponseDTO;
import com.jpa.integrador.dto.response.ClothesResponseDTO;
import com.jpa.integrador.service.IClothService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@PreAuthorize("hasAuthority('ALL')")
public class ClothController {

    @Autowired
    IClothService clothService;

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @PostMapping("/clothes")
    public ResponseEntity<SuccessDTO> addCloth(@RequestBody ClothRequestDTO clothRequestDTO){
        if(clothService.addCloth(clothRequestDTO))
            return ResponseEntity.ok().body(new SuccessDTO("Se agrego una nueva prenda", 201));
        else
            throw new RuntimeException();
    }

   // @PreAuthorize("hasAuthority('ALL')")
    @GetMapping("/clothes")
    public ResponseEntity<ClothesListResponseDTO> findAllClothes(){
        ClothesListResponseDTO dto = clothService.findAllCloth();
        return ResponseEntity.ok().body(dto);
    }



    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/clothes/{code}")
    public ResponseEntity<SuccessDTO> updateClothByCode (@PathVariable("code") Integer code,
                                                         @RequestBody ClothRequestDTO cloth){
        if(clothService.updateCloth(code, cloth))
            return ResponseEntity.ok().body(new SuccessDTO("La prenda se actualizo exitosamente", 201));
        else
            throw new RuntimeException();
    }

    @GetMapping("/clothes/{code}")
    public ResponseEntity<ClothesResponseDTO> findClothByCode (@PathVariable("code") Integer code){
        ClothesResponseDTO dto = clothService.findOneCloth(code);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/clothes/{code}")
    public ResponseEntity<SuccessDTO> deleteClothByCode (@PathVariable("code") Integer code){
        if(clothService.deleteCloth(code))
            return ResponseEntity.ok().body(new SuccessDTO("La prenda se elemino exitosamente", 404));
        else
            throw new RuntimeException();
    }


    @GetMapping("/clothes/search/{size}")
    public ResponseEntity<ClothesListResponseDTO> findClothesBySize(@PathVariable("size") String size){
        ClothesListResponseDTO list = clothService.searchSaleBySize(size);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/clothes/contains")
    public ResponseEntity<ClothesListResponseDTO> findClothesByName(@RequestParam("name") String clothName){
        ClothesListResponseDTO list = clothService.searchClothesByName(clothName);
        return ResponseEntity.ok().body(list);
    }
}


