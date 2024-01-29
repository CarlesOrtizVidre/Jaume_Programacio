package com.carles.Pais.Entitats;

import jakarta.persistence.*;

@Entity
@Table
public class Ciutats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nom;
    private int poblacio;
    private String descripcio;
    private String imatge;

    @ManyToOne
    @JoinColumn(name = "ID_PROVINCIA",nullable = false)
    private Provincies provincies;

    public Ciutats(long id, String nom, int poblacio, String descripcio, String imatge, Provincies provincies) {
        this.id = id;
        this.nom = nom;
        this.poblacio = poblacio;
        this.descripcio = descripcio;
        this.imatge = imatge;
        this.provincies = provincies;
    }

    public Ciutats() {

    }

    public long getId() {
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

    public Provincies getProvincies() {
        return provincies;
    }

    public void setId(long id) {
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

    public void setProvincies(Provincies provincies) {
        this.provincies = provincies;
    }
}
