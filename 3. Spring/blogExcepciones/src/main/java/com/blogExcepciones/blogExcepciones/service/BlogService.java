package com.blogExcepciones.blogExcepciones.service;

import com.blogExcepciones.blogExcepciones.dto.BlogDTO;
import com.blogExcepciones.blogExcepciones.dto.ResponseDTO;

import java.util.List;

public interface BlogService {
    public ResponseDTO post(BlogDTO blog);
    public BlogDTO get(String id);

    public List<BlogDTO> getAll();
}
