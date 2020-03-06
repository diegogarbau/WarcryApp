package com.example.myapplication.entities;

public class Deployment extends ImgCard {

    private final Boolean multiplayer = Boolean.FALSE;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Deployment setId(int id) {
        this.id = id;
        return this;
    }
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public Deployment setImg(String img) {
        this.img = img;
        return this;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Deployment setTitle(String title) {
        this.title = title;
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
    public Deployment setEquilibrated(Boolean equilibrated) {
        this.equilibrated = equilibrated;
        return this;
    }

}
