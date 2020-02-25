package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Quest;


public class QuestService extends TextFileReaderService {

    public final String COMMA_DELIMITER = ",";

    @Override
    public Card mapToItem(String line) {
        String[] p = line.split(COMMA_DELIMITER);// a CSV has comma separated lines
        return new Quest
                .Builder()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setTarget(p[2])
                .setEquilibrated(Boolean.getBoolean(p[3]))
                .setMultiplayer(Boolean.getBoolean(p[4]))
                .build();
    }
}
