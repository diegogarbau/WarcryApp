package com.example.myapplication.entities;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

public class Maps extends ImgCard implements Parcelable {
    private final Boolean multiplayer = Boolean.FALSE;
    private int id;


    @RequiresApi(api = Build.VERSION_CODES.Q)
    protected Maps(Parcel in) {
        id = in.readInt();
        img = in.readString();
        equilibrated = in.readBoolean();
    }

    public Maps() {
    }

    public static final Creator<Maps> CREATOR = new Creator<Maps>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public Maps createFromParcel(Parcel in) {
            return new Maps(in);
        }

        @Override
        public Maps[] newArray(int size) {
            return new Maps[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (multiplayer == null ? 0 : multiplayer ? 1 : 2));
        dest.writeInt(id);
    }

    @Override
   public String getImg() {
        return img;
    }

    @Override
    public Maps setImg(String img) {
        this.img = img;
        return this;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Maps setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    protected Maps setTitle(String title) {
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
    public Maps setEquilibrated(Boolean equilibrated) {
        this.equilibrated = equilibrated;
        return this;
    }
}
