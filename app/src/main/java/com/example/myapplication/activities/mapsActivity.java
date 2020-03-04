package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.entities.Card;
import com.example.myapplication.services.BattleGeneratorService;
import com.example.myapplication.services.MapService;

import java.util.List;

public class mapsActivity extends AppCompatActivity {
    MapService service =  new MapService();

    protected void onCreate(Bundle savedInstanceState) {

        Boolean equilibrated = Boolean.TRUE;
        int players=2;
        BattleGeneratorService battleGeneratorService = new BattleGeneratorService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_generator);
        List<Card> mapsDeck = service.getData("");
    }
}
