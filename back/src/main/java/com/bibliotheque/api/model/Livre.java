package com.bibliotheque.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    @Column(name="isbn")
    private String isbn;

    @Column(name="titre")
    private String titre;

    @Column(name="editeur_id")
    private String editeur_id;

    @Column(name="date_publication")
    private String date_publication;

    @Column(name="description_id")
    private int description_id;

    @Column(name="langue")
    private String langue;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur_id() {
        return editeur_id;
    }
    public void setEditeur_id(String editeur_id) {
        this.editeur_id = editeur_id;
    }

    public String getDate_publication() {
        return date_publication;
    }
    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }

    public int getDescription_id() {
        return description_id;
    }
    public void setDescription_id(int description_id) {
        this.description_id = description_id;
    }

    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Livre(String isbn, String titre, String editeur_id, String date_publication, int description_id, String langue, List<Livre> livreList) {
        this.isbn = isbn;
        this.titre = titre;
        this.editeur_id = editeur_id;
        this.date_publication = date_publication;
        this.description_id = description_id;
        this.langue = langue;
    }
}
