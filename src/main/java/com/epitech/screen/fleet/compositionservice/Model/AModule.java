package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AModule implements Serializable {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "composition_id")
    private Composition composition;

    public AModule() {
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }
}
