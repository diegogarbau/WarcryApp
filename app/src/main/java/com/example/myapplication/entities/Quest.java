package com.example.myapplication.entities;

public class Quest extends TextCard {

    private final Boolean multiplayer = Boolean.FALSE;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    void setDescription(String description) {
        this.description = description;
    }

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
    public Boolean isEquilibrated() {
        return equilibrated;
    }

    @Override
    protected void setEquilibrated(Boolean equilibrated) {
        this.equilibrated = equilibrated;
    }

    @Override
    public Boolean isMultiplayer() {
        return multiplayer;
    }


    public static class Builder {
        int id;
        String title;
        String description;
        Boolean equilibrated;


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

        public Builder setEquilibrated(Boolean equilibrated) {
            this.equilibrated = equilibrated;
            return this;
        }


        public Quest build() {
            Quest quest = new Quest();
            quest.setId(id);
            quest.setTitle(title);
            quest.setDescription(description);
            quest.setEquilibrated(equilibrated);
            return quest;
        }
    }
}
