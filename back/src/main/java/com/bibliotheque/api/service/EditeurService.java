package com.bibliotheque.api.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Editeur;
import com.bibliotheque.api.repository.EditeurRepository;

@Service
public class EditeurService {
    @Autowired
    private EditeurRepository editeurRepository;


    public Optional<Editeur> getEditeur(final Integer id) {
        return editeurRepository.findById(id);
    }

    public Iterable<Editeur> getEditeur() {
        return editeurRepository.findAll();
    }
    
}
