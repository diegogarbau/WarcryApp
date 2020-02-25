package com.example.myapplication.services;

import com.example.myapplication.entities.Card;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public abstract class TextFileReaderService implements WarcryService {


    @Override
    public List<Card> getData(String inputPath) {
        List<Card> inputList = new ArrayList<>();
        try {
            File inputF = new File(inputPath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            inputList = br.lines().skip(1).map(this::mapToItem).collect(Collectors.toList());
            br.close();
        } catch (IOException e) {
        }
        return inputList;
    }

    public abstract Card mapToItem(String line);
}
