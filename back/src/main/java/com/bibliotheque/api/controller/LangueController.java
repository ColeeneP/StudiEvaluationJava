package com.bibliotheque.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.api.model.Langue;
import com.bibliotheque.api.service.LangueService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_LANGUE)
public class LangueController {
    @Autowired
    private LangueService langueService;

    /**
     * Read - Get all languages
     * @return - An Iterable object of Langue full filled
     */
    @GetMapping
    public Iterable<Langue> getLangue() {
        return langueService.getLangue();
    }
    
}
