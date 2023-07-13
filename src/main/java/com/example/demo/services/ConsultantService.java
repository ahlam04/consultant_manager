package com.example.demo.services;

import com.example.demo.entities.Consultant;

import java.util.List;

public interface ConsultantService {

    Consultant create(Long idEntreprise,Consultant consultant);
    List<Consultant> read();
    Consultant update (Long id,Consultant consultant);
    String delete(Long id);
}
