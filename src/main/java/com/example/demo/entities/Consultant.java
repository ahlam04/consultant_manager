package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "consultant")
@Data
public class Consultant {
    @Id()
    @GeneratedValue
    private Long id_consultant;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = true)
    private String num;
    @Column(nullable = false)
    private  String spetialite;


    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;



}
