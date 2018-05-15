package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class SlideView extends AModule {

    private int nbSlides;
    private ArrayList slides;

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


    public ArrayList getSlides() {
        return slides;
    }

    public void setSlides(ArrayList slides) {
        this.slides = slides;
    }
}
