package com.carles.Pais.Entitats;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Relacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "ciutat_id")
    private Ciutats ciutats;

    @ManyToOne
    @JoinColumn(name = "fran_id")
    private Franquicia franquicia;

    public long getId() {
        return id;
    }

    public Ciutats getCiutats() {
        return ciutats;
    }

    public Franquicia getFranquicia() {
        return franquicia;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCiutats(Ciutats ciutats) {
        this.ciutats = ciutats;
    }

    public void setFranquicia(Franquicia franquicia) {
        this.franquicia = franquicia;
    }

    public Relacio() {
    }

    public Relacio(long id, Ciutats ciutats, Franquicia franquicia) {
        this.id = id;
        this.ciutats = ciutats;
        this.franquicia = franquicia;
    }
}
