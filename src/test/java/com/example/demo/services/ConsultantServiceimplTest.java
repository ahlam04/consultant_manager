package com.example.demo.services;

import com.example.demo.repository.ConsultantRepository;
import com.example.demo.repository.EntrepriseRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ConsultantServiceimplTest {

    private ConsultantService underTest;
    private AutoCloseable autoCloseable;

    @Mock
    private ConsultantRepository consultantRepository;

    @Mock
    private EntrepriseRepository entrepriseRepository;

    @BeforeEach
    void setUp() {
        autoCloseable =  MockitoAnnotations.openMocks(this);
        underTest = new ConsultantServiceimpl(consultantRepository , entrepriseRepository);

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void create() {
    }

    @Test
    void read() {
        underTest.read();
        Mockito.verify(consultantRepository).findAll();
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}
