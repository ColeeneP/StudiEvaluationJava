package com.bibliotheque.api.service.impl;

import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.repository.LivreRepository;
import com.bibliotheque.api.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public Livre getLivre(String isbn) {
        Optional<Livre> livreOptional = livreRepository.findById(isbn);
        return livreOptional.orElse(null);
    }

    @Override
    public List<Livre> getAllLivre() {
        return (List<Livre>) livreRepository.findAll();
    }
}
