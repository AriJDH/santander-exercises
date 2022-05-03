package com.santander.bootcamp.M4C13.DTO;

import com.santander.bootcamp.M4C13.models.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkStatusDTO {

    private int id;
    private String url;
    private boolean active;

    public LinkStatusDTO(Link link) {
        this.id = link.getId();
        this.url = link.getUrl();
        this.active = link.isActive();
    }
}
