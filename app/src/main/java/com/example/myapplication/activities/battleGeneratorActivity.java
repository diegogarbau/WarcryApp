package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.entities.BattlePlan;
import com.example.myapplication.services.BattleGeneratorService;

public class battleGeneratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

                Boolean equilibrated = Boolean.TRUE;
                int players=2;
                BattleGeneratorService battleGeneratorService = new BattleGeneratorService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_generator);

        BattlePlan battleplan = battleGeneratorService.generateBattlePlan(equilibrated, players);
    }
}
