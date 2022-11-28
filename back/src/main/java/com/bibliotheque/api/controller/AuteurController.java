package com.bibliotheque.api.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Auteur;
import com.bibliotheque.api.service.AuteurService;

@RestController
public class AuteurController {
    @Autowired
    private AuteurService auteurService;

    /**
     * Read - Get all authors
     * @return - An Iterable object of Author full filled
     */
    @GetMapping("/auteur")
    public Iterable<Auteur> getAuteur() {
        return auteurService.getAuteur();
    }

    /**
     * Read - Get one author
     * @param id The id of the author
     * @return An Author object full filled
     */
    @GetMapping("/auteur/{id}")
    public Auteur getAuteur(@PathVariable("id") final Integer id) {
        Optional<Auteur> auteur = auteurService.getAuteur(id);
        if(auteur.isPresent()) {
            return auteur.get();
        } else {
            return null;
        }
    }
    
}
