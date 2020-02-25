package com.example.myapplication.services;

import com.example.myapplication.entities.Card;

import java.util.List;

public interface WarcryService {

    List<Card> getData(String inputPath);


}
