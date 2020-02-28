package com.example.myapplication.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.entities.Card;
import com.example.myapplication.services.QuestService;
import com.example.myapplication.services.WarcryParserService;

import java.util.List;

public class questsActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;
    private final String inputPath = System.getenv("quest_file_path");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        WarcryParserService questService = new QuestService();
        List<Card> questDeck = questService.getData(inputPath);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvQuests);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyRecyclerViewAdapter(this, questDeck);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
//        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

    }
}