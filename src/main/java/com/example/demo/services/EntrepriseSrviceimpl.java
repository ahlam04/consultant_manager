package com.example.demo.services;


import com.example.demo.entities.Entreprise;
import com.example.demo.repository.EntrepriseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseSrviceimpl implements EntrepriseService {
  private final EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise create(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> read() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise update(Long id, Entreprise entreprise) {
        return entrepriseRepository.findById(id).map(e -> {
            e.setNom(entreprise.getNom());
            e.setNum(entreprise.getNum());
            e.setAdresse(entreprise.getAdresse());
            //e.setConsultant(entreprise.getConsultant());
            return entrepriseRepository.save(e);
        }).orElseThrow(()-> new RuntimeException("Entreprise non trouvée!"));
    }

    @Override
    public String delete(Long id) {
        entrepriseRepository.deleteById(id);
        return "Entreprise supprimée!";
    }
}
