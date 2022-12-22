package com.bibliotheque.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, String>{
    
}