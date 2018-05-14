package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Id;

public abstract class AModule {

    @Id
    private Long id;

    public AModule() {
    }

    public AModule(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
