package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Editeur;
import com.bibliotheque.api.service.EditeurService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_EDITEUR)
public class EditeurController {
    @Autowired
    private EditeurService editeurService;

    /**
     * Read - Get all editors
     * @return - An Iterable object of Editors full filled
     */
    @GetMapping
    public Iterable<Editeur> getEditeur() {
        return editeurService.getEditeur();
    }

    /**
     * Read - Get one editor
     * @param id The id of the editor
     * @return An Editor object full filled
     */
    @GetMapping("{id}")
    public Editeur getEditeur(@PathVariable("id") final Integer id) {
        Optional<Editeur> editeur = editeurService.getEditeur(id);
        if(editeur.isPresent()) {
            return editeur.get();
        } else {
            return null;
        }
    }

}
