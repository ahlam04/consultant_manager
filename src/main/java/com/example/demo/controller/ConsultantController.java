package com.example.demo.controller;

import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.ConsultantRepository;
import com.example.demo.services.ConsultantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Consultant")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ConsultantController {

    private final ConsultantService consultantService;
    @PostMapping("/create/{idEntreprise}")
    @CrossOrigin(origins = "http://localhost:3000")
    public  Consultant create(@PathVariable Long idEntreprise,@RequestBody Consultant consultant){
        return consultantService.create(idEntreprise,consultant);
    }
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Consultant> read(){
        return consultantService.read();
    }
    @PutMapping
    public Consultant update(@PathVariable Long id,@RequestBody Consultant consultant){
        return consultantService.update(id,consultant);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){

        return consultantService.delete(id);
}
    }

