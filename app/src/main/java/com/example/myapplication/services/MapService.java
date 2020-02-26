package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Maps;


public class MapService implements WarcryParserService {
    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Maps
                .Builder()
                .setId(Integer.getInteger(p[0]))
                .setImg(p[1])
                .setEquilibrated(Boolean.getBoolean(p[2]))
                .build();
    }
}
