package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.entities.Card;
import com.example.myapplication.services.QuestService;
import com.example.myapplication.services.WarcryParserService;

import java.util.List;


public class questsActivity extends AppCompatActivity {
    private final String inputpath = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        WarcryParserService questService = new QuestService();
        List<Card> questDeck = questService.getData(inputpath);

/*        questDeck.stream()
                .forEach(
                        card-> R.drawable.quest.
                );*/
    }
}
