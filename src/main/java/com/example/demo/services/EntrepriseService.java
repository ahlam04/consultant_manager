package com.example.demo.services;

import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;

import java.util.List;

public interface EntrepriseService {
    Entreprise create(Entreprise entreprise);
    List<Entreprise> read();
    Entreprise update (Long id,Entreprise entreprise);
    String delete(Long id);
}
