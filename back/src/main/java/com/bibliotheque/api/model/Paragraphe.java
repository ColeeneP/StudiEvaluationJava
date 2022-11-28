package com.bibliotheque.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paragraphe")
public class Paragraphe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int description_id;

    @Column(name="ordre")
    private int ordre;

    @Column(name="texte")
    private String texte;

    public Integer getId(){
        return description_id;
    }
    public void setId(Integer description_id){
        this.description_id = description_id;
    }

    public Integer getOrdre(){
        return ordre;
    }
    public void setOrdre(Integer ordre){
        this.ordre = ordre;
    }

    public String getTexte(){
        return texte;
    }
    public void setTexte(String texte){
        this.texte = texte;
    }
    
}
