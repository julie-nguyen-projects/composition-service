package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;

@Entity
public class BaseModule extends AModule {

    private Long mediaId;

    public BaseModule() {
    }

    public BaseModule(Long mediaId) {
        this.mediaId = mediaId;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }
}
