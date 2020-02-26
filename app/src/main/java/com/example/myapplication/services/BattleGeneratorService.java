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

public class BattleGeneratorService {
    private final String MAPS_FILE_PATH = System.getenv("map_file_path");
    private final String DEPLOYMENT_FILE_PATH = "DEPLOYMENT_FILE_PATH";
    private final String QUEST_FILE_PATH = "QUEST_FILE_VALUE";
    private final String TWIST_FILE_PATH = "TWIST_FILE_PATH";

    private WarcryParserService mapsService = new MapService();
    private WarcryParserService deploymentService = new DeploymentService();
    private WarcryParserService questService = new QuestService();
    private WarcryParserService twistService = new TwistService();

    private List<Card> mapsList = mapsService.getData(MAPS_FILE_PATH);
    private List<Card> deploymentList = deploymentService.getData(DEPLOYMENT_FILE_PATH);
    private List<Card> questList = questService.getData(QUEST_FILE_PATH);
    private List<Card> twistList = twistService.getData(TWIST_FILE_PATH);

    public BattlePlan generateBattlePlan(Boolean equilibrated, int players) {

        List<Card> mapsDeck = filterMaps(mapsList, equilibrated);
        List<Card> deploymentDeck = filterDeploysAndQuest(deploymentList, equilibrated, players);
        List<Card> questDeck = filterDeploysAndQuest(questList, equilibrated, players);
        List<Card> twistDeck = twistList;
        Card emptyCard =  new Deployment.Builder().setTitle("Carta No Encontrada").build();
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
