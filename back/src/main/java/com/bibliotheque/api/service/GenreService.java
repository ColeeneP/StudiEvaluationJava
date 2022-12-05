package com.bibliotheque.api.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bibliotheque.api.model.Genre;
import com.bibliotheque.api.repository.GenreRepository;

@Service
public class GenreService {

    private GenreRepository genreRepository;


    public List<Genre> getGenre() {
        return (List<Genre>) genreRepository.findAll();
    }
}
