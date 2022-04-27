package com.spring.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EntradaBlog {
    private int id;
    private String titulo;
    private String autor;
    private String fecha;

}
