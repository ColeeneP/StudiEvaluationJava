package com.bibliotheque.api.service;

import com.bibliotheque.api.repository.LangueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Langue;

@Service
public class LangueService {
    @Autowired
    private LangueRepository langueRepository;


    public Iterable<Langue> getLangue() {
        return langueRepository.findAll();
    }
    
}
