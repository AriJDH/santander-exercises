package com.santander.bootcamp.M4C13.DTO;

import com.santander.bootcamp.M4C13.models.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkMetricsDTO {

    private int id;
    private String url;
    private int redirects;

    public LinkMetricsDTO(Link link) {
        this.id = link.getId();
        this.url = link.getUrl();
        this.redirects = link.getRedirects();
    }

}
