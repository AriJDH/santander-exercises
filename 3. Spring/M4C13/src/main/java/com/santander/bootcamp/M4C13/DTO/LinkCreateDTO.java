package com.santander.bootcamp.M4C13.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkCreateDTO {

    private String url;
    private String password;

}
