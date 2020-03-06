package com.example.myapplication.entities;

public class Quest extends TextCard {

    private final Boolean multiplayer = Boolean.FALSE;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Quest setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Quest setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Quest setDescription(String description) {
        this.description = description;
        return this;
    }


    @Override
    public Boolean isEquilibrated() {
        return equilibrated;
    }

    @Override
    public Quest setEquilibrated(Boolean equilibrated) {
        this.equilibrated = equilibrated;
        return this;
    }

    @Override
    public Boolean isMultiplayer() {
        return multiplayer;
    }

}
