package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Twist;

import java.util.List;
import java.util.stream.Collectors;


public class TwistService implements WarcryParserService {
    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Twist()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setDescription(p[2]);
    }

    @Override
    public List<Twist> parseDeck(List<Card> deck) {
        return deck.stream()
                .map(card -> (Twist) card)
                .collect(Collectors.toList());
    }

    @Override
    public Twist cast(Card card) {
        return (Twist) card;
    }
}
