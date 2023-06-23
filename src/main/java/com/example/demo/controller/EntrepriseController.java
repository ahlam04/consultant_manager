package com.example.demo.controller;


import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.ConsultantRepository;
import com.example.demo.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Entreprise")
public class EntrepriseController {

    @Autowired
    private EntrepriseRepository entrepriseRepository;


    @GetMapping("/all")
    private List<Entreprise> entrepriseList(){
        return entrepriseRepository.findAll();
    }
}
