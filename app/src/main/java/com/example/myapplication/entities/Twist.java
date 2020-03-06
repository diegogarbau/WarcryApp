package com.example.myapplication.entities;

public class Twist extends TextCard {
    private final Boolean equilibrated = Boolean.TRUE;
    private final Boolean multiplayer = Boolean.TRUE;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Twist setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Twist setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Twist setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Boolean isEquilibrated() {
        return equilibrated;
    }

    @Override
    public Boolean isMultiplayer() {
        return multiplayer;
    }

    @Override
    protected Twist setEquilibrated(Boolean equilibrated) {
        return null;
    }

}
