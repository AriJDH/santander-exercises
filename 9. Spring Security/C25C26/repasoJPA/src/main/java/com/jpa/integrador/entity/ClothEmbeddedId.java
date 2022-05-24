package com.jpa.integrador.entity;

import javax.persistence.*;
import java.io.Serializable;

//Clase de ejemplo para IDs compuestos
@Embeddable
public class ClothEmbeddedId implements Serializable {

    @GeneratedValue
    private Integer idCloth;

    @GeneratedValue
    private Integer idSale;
}
