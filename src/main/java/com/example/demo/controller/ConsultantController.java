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
public class ConsultantController {

    private final ConsultantService consultantService;
    @PostMapping("/create")
    public  Consultant create(@RequestBody Consultant consultant){
        return consultantService.create(consultant);
    }
    @GetMapping
    public List<Consultant> read(){
        return consultantService.read();
    }
    @PutMapping
    public Consultant update(@PathVariable Long id,@RequestBody Consultant consultant){
        return consultantService.update(id,consultant);
    }
@DeleteMapping("/delete")
public String delete(@PathVariable Long id){
        return consultantService.delete(id);
}
    }

