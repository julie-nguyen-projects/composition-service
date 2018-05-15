package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AModule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    @OneToOne
    @JoinColumn(name = "composition_id")
    protected Composition composition;

    public AModule() {
    }

    public AModule(Composition composition) {
        this.composition = composition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }
}
