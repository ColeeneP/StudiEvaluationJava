package com.bibliotheque.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Bibliotheque;
import com.bibliotheque.api.repository.BibliothequeRepository;

@Service
public class BibliothequeService {

    private BibliothequeRepository bibliothequeRepository;



    public Iterable<Bibliotheque> getBibliotheque() {
        return bibliothequeRepository.findAll();
    }
}
