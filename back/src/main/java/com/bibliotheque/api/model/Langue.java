package com.bibliotheque.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "langue")
public class Langue {

    @Id
    @Column(name="nom")
    private String nom;

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}
    
}
