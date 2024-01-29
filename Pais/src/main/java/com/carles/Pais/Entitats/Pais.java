package com.carles.Pais.Entitats;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Provincies> provincies;


    public Pais(){}

    public Pais(Long id, String nom, List<Provincies> provincias) {
        this.id = id;
        this.nom = nom;
        this.provincies = provincias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Provincies> getProvincies() {
        return provincies;
    }

    public void setProvincias(List<Provincies> provincies) {
        this.provincies = provincies;
    }
}

