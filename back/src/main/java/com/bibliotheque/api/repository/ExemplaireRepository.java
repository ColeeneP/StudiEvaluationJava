package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Exemplaire;

@Repository
public interface ExemplaireRepository extends CrudRepository<Exemplaire, Integer>{
    
}