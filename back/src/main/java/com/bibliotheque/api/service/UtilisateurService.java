package com.bibliotheque.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Utilisateur;
import com.bibliotheque.api.repository.UtilisateurRepository;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public Optional<Utilisateur> getUtilisateur(final Integer id) {
        return utilisateurRepository.findById(id);
    }

    public Iterable<Utilisateur> getUtilisateur() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
        return savedUtilisateur;
    }
    
}
