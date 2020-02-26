package com.example.myapplication.entities;

public class Maps extends ImgCard {
    private final Boolean multiplayer = Boolean.FALSE;

    @Override
    public String getImg() {
        return img;
    }

    @Override
    void setImg(String img) {
        this.img = img;
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
    protected String getTitle() {
        return null;
    }

    @Override
    protected void setTitle(String title) {
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
        this.equilibrated = equilibrated;
    }

    public static class Builder {
        private int id;
        private String img;
        private Boolean equilibrated;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setImg(String img) {
            this.img = img;
            return this;
        }

        public Builder setEquilibrated(Boolean equilibrated) {
            this.equilibrated = equilibrated;
            return this;
        }

        public Maps build() {
            Maps maps = new Maps();
            maps.setId(id);
            maps.setImg(img);
            maps.setEquilibrated(equilibrated);
            return maps;
        }
    }
}
