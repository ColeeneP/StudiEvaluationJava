package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Exemplaire;
import com.bibliotheque.api.service.ExemplaireService;

@RestController
public class ExemplaireController {
    @Autowired
    private ExemplaireService exemplaireService;

    /**
     * Read - Get all copies
     * @return - An Iterable object of Copies full filled
     */
    @GetMapping("/exemplaire")
    public Iterable<Exemplaire> getExemplaire() {
        return exemplaireService.getExemplaire();
    }

    /**
     * Read - Get one copy
     * @param id The id of the copy
     * @return An Copy object full filled
     */
    @GetMapping("/exemplaire/{id}")
    public Exemplaire getExemplaire(@PathVariable("id") final Integer id) {
        Optional<Exemplaire> exemplaire = exemplaireService.getExemplaire(id);
        if(exemplaire.isPresent()) {
            return exemplaire.get();
        } else {
            return null;
        }
    }
}
