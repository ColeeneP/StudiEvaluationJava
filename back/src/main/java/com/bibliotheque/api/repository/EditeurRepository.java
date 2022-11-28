package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Editeur;

@Repository
public interface EditeurRepository extends CrudRepository<Editeur, Integer>{
    
}