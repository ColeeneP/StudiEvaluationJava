package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Editeur;
import com.bibliotheque.api.service.EditeurService;

@RestController
public class EditeurController {
    @Autowired
    private EditeurService editeurService;

    /**
     * Read - Get all editors
     * @return - An Iterable object of Editors full filled
     */
    @GetMapping("/editeur")
    public Iterable<Editeur> getEditeur() {
        return editeurService.getEditeur();
    }

    /**
     * Read - Get one editor
     * @param id The id of the editor
     * @return An Editor object full filled
     */
    @GetMapping("/editeur/{id}")
    public Editeur getEditeur(@PathVariable("id") final Integer id) {
        Optional<Editeur> editeur = editeurService.getEditeur(id);
        if(editeur.isPresent()) {
            return editeur.get();
        } else {
            return null;
        }
    }

}
