package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Id;

public abstract class AModule {

    @Id
    private long id;

    public AModule() {
    }

    public AModule(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
