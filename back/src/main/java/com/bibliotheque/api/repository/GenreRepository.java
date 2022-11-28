package com.bibliotheque.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.api.model.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, String>{

}
