package com.example.demo.services;

import com.example.demo.entities.Consultant;

import java.util.List;

public interface ConsultantService {

    Consultant create(Consultant consultant);
    List<Consultant> read();
    Consultant update (Integer id,Consultant consultant);
    String delete(Integer id);
}
