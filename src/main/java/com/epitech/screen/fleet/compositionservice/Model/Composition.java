package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Composition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "module_id")
    private AModule module;

    public Composition() {
    }

    public Composition(AModule module) {
        this.module = module;
    }

    public Long getId() {
        return id;
    }

    public AModule getModule() {
        return module;
    }

    public void setModule(AModule module) {
        this.module = module;
    }
}
