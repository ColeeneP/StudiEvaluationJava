package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.service.LivreService;

@RestController
@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;

    /**
     * Read - Get all books
     * @return - An Iterable object of Books full filled
     */
    @GetMapping("/livre")
    public Iterable<Livre> getLivre() {
        return livreService.getLivre();
    }

    /**
     * Read - Get one book
     * @param isbn The isbn of the book
     * @return An Book object full filled
     */
    @GetMapping("/livre/{isbn}")
    public Livre getLivre(@PathVariable("isbn") final String isbn) {
        Optional<Livre> livre = livreService.getLivre(isbn);
        if(livre.isPresent()) {
            return livre.get();
        } else {
            return null;
        }
    }
    
}