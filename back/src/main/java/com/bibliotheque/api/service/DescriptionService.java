package com.bibliotheque.api.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Description;
import com.bibliotheque.api.repository.DescriptionRepository;

@Service
public class DescriptionService {


    private DescriptionRepository descriptionRepository;


    public Optional<Description> getDescription(final int id) {
        return descriptionRepository.findById(id);
    }
    
}
