package com.example.myapplication.entities;

public class Twist extends TextCard {
    private final Boolean equilibrated = Boolean.TRUE;
    private final Boolean multiplayer = Boolean.TRUE;

    @Override
    public int getId() {
        return id;
    }

    @Override
    protected void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    protected void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void setDescription(String description) {
        this.description = description;
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
    protected void setEquilibrated(Boolean equilibrated) {
    }

    public static class Builder {
        int id;
        String title;
        String description;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Twist build() {
            Twist twist = new Twist();
            twist.setId(id);
            twist.setTitle(title);
            twist.setDescription(description);
            return twist;
        }
    }
}
