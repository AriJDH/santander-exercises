package com.bootcamp.practicosC12P1.services;


import com.bootcamp.practicosC12P1.dao.ImplementacionDAODiplomaArray;
import com.bootcamp.practicosC12P1.models.Diploma;

import java.util.List;

public class DiplomaService {

    ImplementacionDAODiplomaArray dao = new ImplementacionDAODiplomaArray();

    public List<Diploma> getDiplomas() {
        return dao.getElements();
    }

    public void addDiploma(Diploma diploma){
        dao.addElement(diploma);
    }

}
