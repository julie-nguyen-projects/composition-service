package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SlideView extends AModule {

    private int nbSlides;

    @OneToMany
    private List<BaseModule> slides = new ArrayList<>();

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

    public List<BaseModule> getSlides() {
        return slides;
    }

    public void setSlides(List<BaseModule> slides) {
        this.slides = slides;
    }
}
