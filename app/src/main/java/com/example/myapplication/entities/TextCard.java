package com.example.myapplication.entities;

abstract class TextCard extends Card {

    String description;

    abstract String getDescription();
    abstract TextCard setDescription(String description);


}
