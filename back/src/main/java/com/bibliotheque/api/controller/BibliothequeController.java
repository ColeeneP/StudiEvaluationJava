package com.bibliotheque.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.api.model.Bibliotheque;
import com.bibliotheque.api.service.BibliothequeService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_BIBLIOTHEQUE)
public class BibliothequeController {

    @Autowired
    private BibliothequeService bibliothequeService;

    /**
    * Read - Get all bibliotheque
    * @return - An Iterable object of Bibliotheque full filled
    */
    @GetMapping
    public Iterable<Bibliotheque> getBibliotheque() {
        return bibliothequeService.getBibliotheque();
    }
    
}
