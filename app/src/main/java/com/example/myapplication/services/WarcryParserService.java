package com.example.myapplication.services;

import com.example.myapplication.entities.Card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public interface WarcryParserService {
    String COMMA_DELIMITER = ",";


    default List<?> getData(InputStream inputFile) {
        List<?> inputList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFile));
            inputList = br.lines()
                    .skip(1)
                    .map((String line) -> mapToItem(line, COMMA_DELIMITER))
                    .map(card -> cast(card))
                    .collect(Collectors.toList());
            br.close();
        } catch (IOException e) {
        }
        return inputList;
    }

    Card mapToItem(String line, String delimiter);

    List<?> parseDeck(List<Card> deck);

    Card cast(Card card);

}