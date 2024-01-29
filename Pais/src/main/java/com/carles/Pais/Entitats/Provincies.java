package com.carles.Pais.Entitats;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Provincies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nom;

    @ManyToOne
    @JoinColumn(name = "ID_PAIS", nullable = false)
    private Pais pais;

    @OneToMany(mappedBy = "provincies", cascade = CascadeType.ALL)
    private List<Ciutats> ciutats;

    public Provincies() {}

    public Provincies(long id, String nom, Pais pais, List<Ciutats> ciutats) {
        this.id = id;
        this.nom = nom;
        this.pais = pais;
        this.ciutats = ciutats;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Pais getPais() {
        return pais;
    }

    public List<Ciutats> getCiutats() {
        return ciutats;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setCiutats(List<Ciutats> ciutats) {
        this.ciutats = ciutats;
    }
}
