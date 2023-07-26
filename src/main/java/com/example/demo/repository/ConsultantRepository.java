package com.example.demo.repository;


import com.example.demo.entities.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultantRepository extends JpaRepository<Consultant,Long> {
}
