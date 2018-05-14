package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Composition {

    @Id
    private long id;

    private AModule module;

    public Composition() {
    }

    public Composition(long id, AModule module) {
        this.id = id;
        this.module = module;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AModule getModule() {
        return module;
    }

    public void setModule(AModule module) {
        this.module = module;
    }
}
