package com.bibliotheque.api.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.repository.LivreRepository;

@Service
public interface LivreService {

    Livre getLivre(final String isbn);

    List<Livre> getAllLivre();
}
