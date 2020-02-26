package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Quest;


public class QuestService implements WarcryParserService {
    private final String inputpath = "/questFile.csv";

    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Quest
                .Builder()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setDescription(p[2])
                .setEquilibrated(Boolean.getBoolean(p[3]))
                .build();
    }
}
