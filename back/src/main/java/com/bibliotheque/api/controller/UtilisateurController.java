package com.bibliotheque.api.controller;

import java.rmi.ServerException;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bibliotheque.api.model.Utilisateur;
import com.bibliotheque.api.service.UtilisateurService;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    /**
     * Read - Get all users
     * @return - An Iterable object of Users full filled
     */
    @GetMapping("/utilisateur")
    public Iterable<Utilisateur> getUtilisateur() {
        return utilisateurService.getUtilisateur();
    }

    /**
     * Read - Get one user
     * @param id The id of the user
     * @return An User object full filled
     */
    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable("id") final Integer id) {
        Optional<Utilisateur> utilisateur = utilisateurService.getUtilisateur(id);
        if(utilisateur.isPresent()) {
            return utilisateur.get();
        } else {
            return null;
        }
    }

    @PostMapping("/utilisateur")
    public ResponseEntity<Utilisateur> create(@RequestBody Utilisateur newUtilisateur) throws ServerException {
        Utilisateur utilisateur = utilisateurService.saveUtilisateur(newUtilisateur);
        if (utilisateur == null) {
            throw new ServerException("RemoteException occurred in server thread");
        } else {
            return new ResponseEntity<>(utilisateur, HttpStatus.CREATED);
        }
    }}
