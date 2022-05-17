package com.example.jewelry.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

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
