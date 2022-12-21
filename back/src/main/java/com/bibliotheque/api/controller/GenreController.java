package com.bibliotheque.api.controller;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Genre;
import com.bibliotheque.api.service.GenreService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_GENRE)
public class GenreController {

    @Autowired
    private GenreService genreService;

	/**
	 * Read - Get all genre
	 * @return - An Iterable object of Genre full filled
	 */
	@GetMapping
	public Iterable<Genre> getGenre() {
		return genreService.getGenre();
	}
}
