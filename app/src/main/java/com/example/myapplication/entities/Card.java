package com.example.myapplication.entities;

public abstract class Card {
    int id;
    String title;
    Boolean equilibrated;
    protected Boolean multiplayer;

    protected abstract int getId();

    protected abstract void setId(int id);

    protected abstract String getTitle();

    protected abstract void setTitle(String title);

    public abstract Boolean isEquilibrated();

    public abstract Boolean isMultiplayer();

    protected abstract void setEquilibrated(Boolean equilibrated);

}
