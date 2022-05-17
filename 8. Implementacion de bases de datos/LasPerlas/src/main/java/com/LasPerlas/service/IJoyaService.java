package com.LasPerlas.service;

import com.LasPerlas.dto.response.JoyaDtoResponse;
import com.LasPerlas.dto.response.MessageDto;
import com.LasPerlas.entity.Joya;

import java.util.List;

public interface IJoyaService {

    public List<JoyaDtoResponse> getJoyas();
    public void saveJoya (JoyaDtoResponse joyaDtoResponse);
    public MessageDto deleteJoya(long id);
    public JoyaDtoResponse findJoya(long id);
}
