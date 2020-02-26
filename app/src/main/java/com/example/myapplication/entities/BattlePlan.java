package com.example.myapplication.entities;

public class BattlePlan {
    private Maps map;
    private Deployment  deployment;
    private Quest quest;
    private Twist twist;

    public Maps getMap() {
        return map;
    }

    public BattlePlan setMap(Maps map) {
        this.map = map;
        return this;
    }

    public Deployment getDeployment() {
        return deployment;
    }

    public BattlePlan setDeployment(Deployment deployment) {
        this.deployment = deployment;
        return this;
    }

    public Quest getQuest() {
        return quest;
    }

    public BattlePlan setQuest(Quest quest) {
        this.quest = quest;
        return this;
    }

    public Twist getTwist() {
        return twist;
    }

    public BattlePlan setTwist(Twist twist) {
        this.twist = twist;
        return this;
    }
}
