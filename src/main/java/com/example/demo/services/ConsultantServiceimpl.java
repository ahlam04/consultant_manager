package com.example.demo.services;

import com.example.demo.entities.Consultant;
import com.example.demo.entities.Entreprise;
import com.example.demo.repository.ConsultantRepository;
import com.example.demo.repository.EntrepriseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConsultantServiceimpl implements ConsultantService {
    private final ConsultantRepository consultantRepository;
    private final EntrepriseRepository entrepriseRepository;
    @Override
    public Consultant create(Long idEntreprise,Consultant consultant) {
       Optional<Entreprise>  entreprise=entrepriseRepository.findById(idEntreprise);
       if(!entreprise.isPresent()) {
           throw new RuntimeException("entreprise not found");
       }
       consultant.setEntreprise(entreprise.get());

       return consultantRepository.save(consultant);
    }

    @Override
    public List<Consultant> read() {
        return consultantRepository.findAll();
    }

    @Override
    public Consultant update(Long id, Consultant consultant) {
        return consultantRepository.findById(id)
                .map( c -> {
                    c.setNom(consultant.getNom());
                    c.setPrenom(consultant.getPrenom());
                    c.setNum(consultant.getNum());
                    c.setSpetialite(consultant.getSpetialite());
                    return consultantRepository.save(c);
                }).orElseThrow(()-> new RuntimeException("consulatant non trouvé!"));



 }

    @Override
    public String delete(Long id) {


            consultantRepository.deleteById(id);
            return "Consultant supprimé!";
        }

}
