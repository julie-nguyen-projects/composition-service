package com.epitech.screen.fleet.compositionservice.Model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
public abstract class AModule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    public AModule() {
    }

    public Long getId() {
        return id;
    }
}
