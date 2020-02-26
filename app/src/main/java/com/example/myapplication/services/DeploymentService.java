package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Deployment;


public class DeploymentService implements WarcryParserService {

    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Deployment
                .Builder()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setImg(p[2])
                .setEquilibrated(Boolean.getBoolean(p[3]))
                .build();
    }
}
