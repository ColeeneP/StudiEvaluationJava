package com.bibliotheque.api.service.impl;

import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.service.LivreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {

    private static List<Livre> mesLivres = new ArrayList<>();

    @Override
    public Optional<Livre> getLivre(String isbn) {
        return Optional.empty();
    }

    @Override
    public List<Livre> getAllLivre() {
        return null;
    }
}
