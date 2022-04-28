package com.santanderbootcamp.Blog.repo;

import com.santanderbootcamp.Blog.model.EntradaBlog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntradasBlogListDaoImpl implements Dao<String,EntradaBlog> {
    private List<EntradaBlog> entradas = new ArrayList<>();

    @Override
    public void agregarElemento(EntradaBlog elemento) {
        entradas.add(elemento);
    }
}
