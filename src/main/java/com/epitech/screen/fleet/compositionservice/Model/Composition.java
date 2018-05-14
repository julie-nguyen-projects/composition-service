package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Composition {

    @Id
    private Long id;

    private AModule module;

    public Composition() {
    }

    public Composition(Long id, AModule module) {
        this.id = id;
        this.module = module;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AModule getModule() {
        return module;
    }

    public void setModule(AModule module) {
        this.module = module;
    }
}
