package com.bibliotheque.api.model;

import javax.persistence.*;

@Entity
@Table(name = "livre_auteur")
public class LivreAuteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String isbn;

    private Integer auteur_id;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAuteur_id() {
        return auteur_id;
    }

    public void setAuteur_id(Integer auteur_id) {
        this.auteur_id = auteur_id;
    }
}
