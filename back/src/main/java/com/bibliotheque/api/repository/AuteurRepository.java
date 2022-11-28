package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Auteur;

@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Integer> {
    
}