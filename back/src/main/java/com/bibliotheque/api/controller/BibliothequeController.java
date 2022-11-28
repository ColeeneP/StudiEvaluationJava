package com.bibliotheque.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.api.model.Bibliotheque;
import com.bibliotheque.api.service.BibliothequeService;

@RestController
public class BibliothequeController {

    @Autowired
    private BibliothequeService bibliothequeService;

    /**
    * Read - Get all bibliotheque
    * @return - An Iterable object of Bibliotheque full filled
    */
    @GetMapping("/bibliotheque")
    public Iterable<Bibliotheque> getBibliotheque() {
        return bibliothequeService.getBibliotheque();
    }
    
}
