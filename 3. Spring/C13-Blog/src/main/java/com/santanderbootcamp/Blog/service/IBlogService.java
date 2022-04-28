package com.santanderbootcamp.Blog.service;

import com.santanderbootcamp.Blog.dto.EntradaBlogDto;

import java.util.List;

public interface IBlogService {
    public void nuevaEntrada(EntradaBlogDto entrada);

    public EntradaBlogDto informacionEntrada(int id);

    public List<EntradaBlogDto> getEntradas();
}
