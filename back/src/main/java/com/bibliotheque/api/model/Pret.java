package com.bibliotheque.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pret")
public class Pret {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="date_debut")
    private String date_debut;

    @Column(name="date_fin")
    private String date_fin;

    @Column(name="renouvele")
    private Boolean renouvele;

    @Column(name="utilisateur_id")
    private int utilisateur_id;

    @Column(name="exemplaire_id")
    private int exemplaire_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public Boolean getRenouvele() {
        return renouvele;
    }

    public void setRenouvele(Boolean renouvele) {
        this.renouvele = renouvele;
    }

    public int getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(int utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public int getExemplaire_id() {
        return exemplaire_id;
    }

    public void setExemplaire_id(int exemplaire_id) {
        this.exemplaire_id = exemplaire_id;
    }
}
