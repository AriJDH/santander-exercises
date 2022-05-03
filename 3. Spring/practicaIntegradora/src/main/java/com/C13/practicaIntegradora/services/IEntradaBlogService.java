package com.C13.practicaIntegradora.services;

import com.C13.practicaIntegradora.dtos.EntradaBlogDto;


import java.util.List;

public interface IEntradaBlogService {
    public List<EntradaBlogDto> getPostById(Integer numero);
    public List<EntradaBlogDto> getPosts();
}
