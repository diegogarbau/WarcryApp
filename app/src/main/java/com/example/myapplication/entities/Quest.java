package com.example.myapplication.entities;

public class Quest extends Card {

    private String target;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEquilibrated() {
        return equilibrated;
    }

    public void setEquilibrated(boolean equilibrated) {
        this.equilibrated = equilibrated;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.equilibrated = multiplayer;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


    public static class Builder {
        int id;
        String title;
        String target;
        Boolean equilibrated;
        Boolean multiplayer;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTarget(String target) {
            this.target = target;
            return this;
        }

        public Builder setEquilibrated(Boolean equilibrated) {
            this.equilibrated = equilibrated;
            return this;
        }

        public Builder setMultiplayer(Boolean multiplayer) {
            this.multiplayer = multiplayer;
            return this;
        }

        public Quest build() {
            Quest quest = new Quest();
            quest.id = id;
            quest.title = title;
            quest.target = target;
            quest.equilibrated = equilibrated;
            quest.multiplayer = equilibrated;
            return quest;
        }
    }
}
