package com.epitech.screen.fleet.compositionservice.Model.Associated;

public class Media {

    private long id;
    private String name;
    private String path;
    private MediaType type;

    public Media() {
    }

    public Media(long id, String name, String path, MediaType type) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
