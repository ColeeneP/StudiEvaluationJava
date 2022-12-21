package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Paragraphe;
import com.bibliotheque.api.service.ParagrapheService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_PARAGRAPHE)
public class ParagrapheController {
    @Autowired
    private ParagrapheService paragrapheService;

    /**
     * Read - Get one paragraphe
     * @param id The id of the paragraphe
     * @return An Paragraphe object full filled
     */
    @GetMapping("{id}")
    public Paragraphe getParagraphe(@PathVariable("id") final Integer id) {
        Optional<Paragraphe> paragraphe = paragrapheService.getParagraphe(id);
        if(paragraphe.isPresent()) {
            return paragraphe.get();
        } else {
            return null;
        }
    }
    
}
