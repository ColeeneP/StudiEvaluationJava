package com.bibliotheque.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.service.LivreService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_LIVRE)
@CrossOrigin
public class LivreController {
    @Autowired
    private LivreService livreService;

    /**
     * Read - Get all books
     * @return - A List of Books full filled
     */
    @GetMapping
    public List<Livre> getAllLivre() {
        return livreService.getAllLivre();
    }

    /**
     * Read - Get one book
     * @param isbn The isbn of the book
     * @return An Book object full filled
     */
    @GetMapping("{isbn}")
    public Livre getLivre(@PathVariable("isbn") final String isbn) {
        return livreService.getLivre(isbn);
    }
    
}
