package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Paragraphe;

@Repository
public interface ParagrapheRepository extends CrudRepository<Paragraphe, Integer>{
    
}