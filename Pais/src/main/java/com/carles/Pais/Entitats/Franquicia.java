package com.carles.Pais.Entitats;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Franquicia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "Pais", cascade = CascadeType.ALL)
    private List<Franquicia>franquicias;


    public Franquicia(long id, List<Franquicia> franquicias) {
        this.id = id;
        this.franquicias = franquicias;
    }

    public Franquicia() {
    }

    public long getId() {
        return id;
    }

    public List<Franquicia> getFranquicias() {
        return franquicias;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFranquicias(List<Franquicia> franquicias) {
        this.franquicias = franquicias;
    }
}
