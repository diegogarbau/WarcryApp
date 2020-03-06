package com.example.myapplication.services;

import com.example.myapplication.entities.BattlePlan;
import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Deployment;
import com.example.myapplication.entities.Maps;
import com.example.myapplication.entities.Quest;
import com.example.myapplication.entities.Twist;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BattleGeneratorService<MAPS_FILE_PATH> {


    public BattlePlan generateBattlePlan(Boolean equilibrated, int players, List[] decks) {

        List mapsDeck = filterMaps(decks[0], equilibrated);
        List deploymentDeck = filterDeploysAndQuest(decks[1], equilibrated, players);
        List questDeck = filterDeploysAndQuest(decks[2], equilibrated, players);
        List twistDeck = decks[3];
        Card emptyCard = new Deployment().setTitle("Carta No Encontrada");
        return new BattlePlan()
                .setMap((Maps) pickOne(mapsDeck.stream(), mapsDeck.size()).orElse(emptyCard))
                .setDeployment((Deployment) pickOne(deploymentDeck.stream(), deploymentDeck.size()).orElse(emptyCard))
                .setQuest((Quest) pickOne(questDeck.stream(), questDeck.size()).orElse(emptyCard))
                .setTwist((Twist) pickOne(twistDeck.stream(), twistDeck.size()).orElse(emptyCard));
    }

    private Optional<Card> pickOne(Stream<Card> deck, int deckSize) {
        return deck.skip((int) (deckSize * Math.random())).findAny();
    }

    private List<Card> filterMaps(List<Card> deck, Boolean equilibrated) {
        return deck
                .stream()
                .filter(map -> map.isEquilibrated() == equilibrated)
                .collect(Collectors.toList());
    }

    private List<Card> filterDeploysAndQuest(List<Card> deck, Boolean equilibrated, int players) {
        return deck
                .stream()
                .filter(map -> map.isEquilibrated() == equilibrated)
                .filter(map -> map.isMultiplayer() == players > 2)
                .collect(Collectors.toList());
    }


}
