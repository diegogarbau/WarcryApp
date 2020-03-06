package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.entities.BattlePlan;
import com.example.myapplication.services.BattleGeneratorService;
import com.example.myapplication.services.DeploymentService;
import com.example.myapplication.services.MapService;
import com.example.myapplication.services.QuestService;
import com.example.myapplication.services.TwistService;
import com.example.myapplication.services.WarcryParserService;

import java.io.InputStream;
import java.util.List;

public class battleGeneratorActivity extends AppCompatActivity {


    private final int MAPS_FILE_PATH = R.raw.mapsfile;
    private final int DEPLOYMENT_FILE_PATH = R.raw.deploymentsfile;
    private final int QUEST_FILE_PATH = R.raw.questsfile;
    private final int TWIST_FILE_PATH = R.raw.twistsfile;

    private WarcryParserService mapsService = new MapService();
    private WarcryParserService deploymentService = new DeploymentService();
    private WarcryParserService questService = new QuestService();
    private WarcryParserService twistService = new TwistService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Boolean equilibrated = Boolean.TRUE;
        int players = 2;
        BattleGeneratorService battleGeneratorService = new BattleGeneratorService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_generator);
        InputStream mapsDeck = getResources().openRawResource(MAPS_FILE_PATH);

        List<?> mapsList = mapsService.getData(getResources().openRawResource(MAPS_FILE_PATH));
        List<?> deploymentList = deploymentService.getData(getResources().openRawResource(DEPLOYMENT_FILE_PATH));
        List<?> questList = questService.getData(getResources().openRawResource(QUEST_FILE_PATH));
        List<?> twistList = twistService.getData(getResources().openRawResource(TWIST_FILE_PATH));
        List[] decks = new List[]{mapsList, deploymentList,questList,twistList};
        BattlePlan battleplan = battleGeneratorService.generateBattlePlan(equilibrated, players,decks);
    }
}
