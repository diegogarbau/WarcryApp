package com.example.myapplication.entities;

public abstract class Card {
    int id;
    String title;
    Boolean equilibrated;
    protected Boolean multiplayer;

    protected abstract int getId();

    protected abstract Card setId(int id);

    public abstract String getTitle();

    protected abstract Card setTitle(String title);

    public abstract Boolean isEquilibrated();

    public abstract Boolean isMultiplayer();

    protected abstract Card setEquilibrated(Boolean equilibrated);

}
