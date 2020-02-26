package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Twist;


public class TwistService implements WarcryParserService {
    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Twist
                .Builder()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setDescription(p[2])
                .build();
    }
}
