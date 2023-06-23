package com.example.demo.controller;

import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("Consultant")
public class ConsultantController {

    @Autowired
    private ConsultantRepository consultantRepository;


    @GetMapping("/all")
    private List<Consultant> consultantList(){
        return consultantRepository.findAll();
    }

}
