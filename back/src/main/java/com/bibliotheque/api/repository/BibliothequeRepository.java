package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Bibliotheque;

@Repository
public interface BibliothequeRepository extends CrudRepository<Bibliotheque, Bibliotheque>{
    
}