package com.example.demo.controller;


import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.ConsultantRepository;
import com.example.demo.repository.EntrepriseRepository;
import com.example.demo.services.EntrepriseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Entreprise")
@AllArgsConstructor
public class EntrepriseController {

    private final EntrepriseService entrepriseService;
    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:3000")
    public  Entreprise create(@RequestBody Entreprise entreprise){
        return entrepriseService.create(entreprise);
    }
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Entreprise> read(){
        return entrepriseService.read();
    }
    @PutMapping
    public Entreprise update(@PathVariable Long id,@RequestBody Entreprise entreprise){
        return entrepriseService.update(id,entreprise);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return entrepriseService.delete(id);
    }
}

