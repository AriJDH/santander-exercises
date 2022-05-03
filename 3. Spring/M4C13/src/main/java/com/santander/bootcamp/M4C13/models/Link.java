package com.santander.bootcamp.M4C13.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Link {

    private int id;
    private String url;
    private String password;
    private int redirects;
    private boolean active;

    public Link(String url, int id) {
        this.url = url;
        this.id = id;
        this.redirects = 0;
        this.active = true;
    }

    public Link(int id, String url, int redirects, boolean active) {
        this.id = id;
        this.url = url;
        this.redirects = redirects;
        this.active = active;
    }

    public void sumarRedirects () {
        this.redirects = this.redirects + 1;
    }

}
