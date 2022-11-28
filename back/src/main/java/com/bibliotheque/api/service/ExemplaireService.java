package com.bibliotheque.api.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Exemplaire;
import com.bibliotheque.api.repository.ExemplaireRepository;

@Service
public class ExemplaireService {
    @Autowired
    private ExemplaireRepository exemplaireRepository;


    public Optional<Exemplaire> getExemplaire(final Integer id) {
        return exemplaireRepository.findById(id);
    }

    public Iterable<Exemplaire> getExemplaire() {
        return exemplaireRepository.findAll();
    }
}
