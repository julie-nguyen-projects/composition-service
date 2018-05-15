package com.epitech.screen.fleet.compositionservice.Model;

import com.epitech.screen.fleet.compositionservice.Model.Associated.Media;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseModule extends AModule {

    private Media media;

    public BaseModule() {
    }

    public BaseModule(Media media) {
        this.media = media;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }
}
