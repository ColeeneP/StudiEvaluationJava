package com.bibliotheque.api.model;

import javax.persistence.*;

@Entity
@Table(name = "auteur")
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne
    private Integer id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getPrenom(){return prenom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    
}
