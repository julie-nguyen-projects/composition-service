package com.epitech.screen.fleet.compositionservice.Model.Associated;

public class Media {

    private Long id;
    private String name;
    private String path;
    private MediaType type;

    public Media() {
    }

    public Media(Long id, String name, String path, MediaType type) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }
}
