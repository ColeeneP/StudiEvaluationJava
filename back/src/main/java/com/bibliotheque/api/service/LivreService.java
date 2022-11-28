package com.bibliotheque.api.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.repository.LivreRepository;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;


    public Optional<Livre> getLivre(final String isbn) {
        return livreRepository.findById(isbn);
    }

    public Iterable<Livre> getLivre() {
        return livreRepository.findAll();
    }
    
}
