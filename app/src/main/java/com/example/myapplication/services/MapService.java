package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Maps;

import java.util.List;
import java.util.stream.Collectors;


public class MapService implements WarcryParserService {
    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Maps()
                .setId(Integer.parseInt(p[0]))
                .setImg(p[1])
                .setEquilibrated(Boolean.valueOf(p[2]));
    }

    @Override
    public List<Maps> parseDeck(List<Card> deck) {
        return deck.stream()
                .map(card -> (Maps) card)
                .collect(Collectors.toList());
    }

    @Override
    public Maps cast (Card card) {
        return (Maps) card;
    }
}
