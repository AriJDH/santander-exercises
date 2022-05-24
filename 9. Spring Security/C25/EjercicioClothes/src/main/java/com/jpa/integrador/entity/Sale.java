package com.jpa.integrador.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ventas")
public class Sale {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "fecha")
    private LocalDate date;
    @Column(name = "monto_total")
    private Double totalAmount;
    @Column(name = "metodo_pago")
    private String paymentMethod;

    @OneToMany(mappedBy = "ventas")
    //fetch = FetchType.LAZY)
    private List<Cloth> cloth;

}
