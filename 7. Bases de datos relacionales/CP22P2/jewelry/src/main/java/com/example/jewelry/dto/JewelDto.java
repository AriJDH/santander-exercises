package com.example.jewelry.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JewelDto {
    @JsonProperty("nombre")
    private String name;
    @JsonProperty("material")
    private String material;
    @JsonProperty("peso")
    private String weight;
    @JsonProperty("particularidad")
    private String description;
    @JsonProperty("posee_piedra")
    private Boolean hasStone;
    @JsonProperty("ventaONo")
    private Boolean sellable;
}
