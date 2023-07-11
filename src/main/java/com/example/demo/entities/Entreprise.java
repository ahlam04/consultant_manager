package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "ENTREPRISE")
@Data

public class Entreprise implements Serializable  {
    @Id()
    @GeneratedValue
    private Long id_enteprise;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = true)
    private String num;
    @Column(nullable = false)
    private  String adresse;
    @Column(nullable = false)
    private  String consultant;

}
