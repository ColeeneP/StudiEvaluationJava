package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Description;

@Repository
public interface DescriptionRepository extends CrudRepository<Description, Integer>{
    
}