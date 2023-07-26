package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ENTREPRISE")
@Data
public class Entreprise implements Serializable  {
    @Id
    @SequenceGenerator(
            name = "consultant_id_sequence",
            sequenceName = "consultant_id_sequence"
    )
    @GeneratedValue(
            generator = "consultant_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id_enteprise;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String num;
    @Column(nullable = false)
    private  String adresse;
    /* @Column(nullable = false)
    private  String consultant;*/





}
