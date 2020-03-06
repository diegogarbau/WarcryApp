package com.example.myapplication.services;

import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Deployment;

import java.util.List;
import java.util.stream.Collectors;


public class DeploymentService implements WarcryParserService {

    @Override
    public Card mapToItem(String line, String delimiter) {
        String[] p = line.split(delimiter);// a CSV has comma separated lines
        return new Deployment()
                .setId(Integer.getInteger(p[0]))
                .setTitle(p[1])
                .setImg(p[2])
                .setEquilibrated(Boolean.getBoolean(p[3]));
    }

    @Override
    public List<?> parseDeck(List<Card> deck) {
        return deck.stream()
                .map(card -> (Deployment) card)
                .collect(Collectors.toList());
    }

    @Override
    public Deployment cast(Card card) {
        return (Deployment) card;
    }
}
