package com.santanderbootcamp.LinkTracker.service;

import com.santanderbootcamp.LinkTracker.dto.LinkDto;
import com.santanderbootcamp.LinkTracker.dto.ResponseLinkDto;
import org.springframework.http.RequestEntity;

public interface ILinkTrackerService {
    public ResponseLinkDto agregarUrl(LinkDto linkDto);

    public ResponseLinkDto obtenerLinkId(int id, String password);

    public void invalidarLinkId(int id, LinkDto linkDto);
}
