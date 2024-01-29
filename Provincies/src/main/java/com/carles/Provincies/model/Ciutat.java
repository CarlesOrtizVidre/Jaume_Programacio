package com.carles.Provincies.model;

import jakarta.persistence.*;


@Entity
@Table
public class Ciutat {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String nom;
        private int poblacio;
        private String descripcio;
        private String imatge;

    public Ciutat() {

    }


// Constructors, getters i setters

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPoblacio() {
        return poblacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getImatge() {
        return imatge;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }

    public Ciutat(Long id, String nom, int poblacio, String descripcio, String imatge) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        this.imatge = imatge;
    }
}