package com.example.demo.repository;

import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {

}

