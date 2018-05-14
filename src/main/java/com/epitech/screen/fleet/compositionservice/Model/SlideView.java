package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class SlideView extends AModule {

    private int nbSlides;
    private List<AModule> slides;

    public SlideView() {
    }

    public SlideView(Long id) {
        super(id);
    }

    public SlideView(int nbSlides, List<AModule> slides) {
        this.nbSlides = nbSlides;
        this.slides = slides;
    }

    public SlideView(Long id, int nbSlides, List<AModule> slides) {
        super(id);
        this.nbSlides = nbSlides;
        this.slides = slides;
    }

    public int getNbSlides() {
        return nbSlides;
    }

    public void setNbSlides(int nbSlides) {
        this.nbSlides = nbSlides;
    }

    public List<AModule> getSlides() {
        return slides;
    }

    public void setSlides(List<AModule> slides) {
        this.slides = slides;
    }
}
