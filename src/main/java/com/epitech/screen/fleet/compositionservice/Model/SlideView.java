package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class SlideView extends AModule {

    private int nbSlides;

    public SlideView() {
    }

    public SlideView(int nbSlides) {
        this.nbSlides = nbSlides;
    }

    public int getNbSlides() {
        return nbSlides;
    }

    public void setNbSlides(int nbSlides) {
        this.nbSlides = nbSlides;
    }

}
