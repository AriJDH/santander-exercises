package com.example.C13EjercicioPracticoBlog.service;

import com.example.C13EjercicioPracticoBlog.dto.BlogDTO;

import java.util.HashMap;

public interface IService {
    public Integer create_blog(BlogDTO blogDTO);
    public BlogDTO obtener_blog(Integer id);
    public HashMap<Integer,BlogDTO> devolver_blogs();
}
