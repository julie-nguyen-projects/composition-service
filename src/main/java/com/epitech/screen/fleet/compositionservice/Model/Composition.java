package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Composition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "composition")
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
