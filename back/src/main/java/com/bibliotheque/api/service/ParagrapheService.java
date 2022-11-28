package com.bibliotheque.api.service;

import java.util.Optional;

import com.bibliotheque.api.model.Paragraphe;
import com.bibliotheque.api.repository.ParagrapheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParagrapheService {
    @Autowired
    private ParagrapheRepository paragrapheRepository;


    public Optional<Paragraphe> getParagraphe(final Integer id) {
        return paragrapheRepository.findById(id);
    }
    
}
