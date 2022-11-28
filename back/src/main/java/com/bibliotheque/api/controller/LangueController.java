package com.bibliotheque.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.api.model.Langue;
import com.bibliotheque.api.service.LangueService;

@RestController
public class LangueController {
    @Autowired
    private LangueService langueService;

    /**
     * Read - Get all languages
     * @return - An Iterable object of Langue full filled
     */
    @GetMapping("/langue")
    public Iterable<Langue> getLangue() {
        return langueService.getLangue();
    }
    
}
