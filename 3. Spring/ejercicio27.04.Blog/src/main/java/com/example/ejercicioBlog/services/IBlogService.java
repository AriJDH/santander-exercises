package com.example.ejercicioBlog.services;

import com.example.ejercicioBlog.dto.BlogDto;

import java.util.List;

public interface IBlogService {

    public BlogDto findId(Integer id);
    public void addElemento(BlogDto entradaBlog);
}
