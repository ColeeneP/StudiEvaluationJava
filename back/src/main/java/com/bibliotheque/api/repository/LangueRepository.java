package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Langue;

@Repository
public interface LangueRepository extends CrudRepository<Langue, String>{
    
}