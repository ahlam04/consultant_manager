package com.example.demo.services;

import com.example.demo.entities.Consultant;
import com.example.demo.repository.ConsultantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ConsultantServiceimpl implements ConsultantService {
    private final ConsultantRepository consultantRepository;
    @Override
    public Consultant create(Consultant consultant) {
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
