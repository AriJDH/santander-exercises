package com.santander.bootcamp.M4C13.DTO;

import com.santander.bootcamp.M4C13.models.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkIdDTO {

    private int id;
    private String url;

    public LinkIdDTO(Link link) {
        this.id = link.getId();
        this.url = link.getUrl();
    }

}
