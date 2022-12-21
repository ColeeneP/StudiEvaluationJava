package com.bibliotheque.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotheque.api.model.Auteur;
import com.bibliotheque.api.repository.AuteurRepository;

import java.util.Optional;

@Service
public class AuteurService {


    private AuteurRepository auteurRepository;

    public Optional<Auteur> getAuteur(final Integer id) {
        return auteurRepository.findById(id);
    }

    public Iterable<Auteur> getAllAuteur() {
        return auteurRepository.findAll();
    }

    // public Auteur saveAuteur(Auteur auteur) {
    //   Auteur savedAuteur = auteurRepository.save(auteur);
    //    return savedAuteur;
    //}
}
