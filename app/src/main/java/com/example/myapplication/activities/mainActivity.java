package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class mainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton maps = this.findViewById(R.id.maps_button);
        ImageButton bands = this.findViewById(R.id.bands_button);
        ImageButton quest = this.findViewById(R.id.quest_button);
        ImageButton deployment = this.findViewById(R.id.deployment_button);
        ImageButton event = this.findViewById(R.id.events_button);
        ImageButton battleGenerator = this.findViewById(R.id.battleplanGenerator_button);

        maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(mapsActivity.class);
            }
        });
        bands.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(bandsActivity.class);
            }
        });
        quest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(questsActivity.class);
            }
        });
        deployment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(deploymentActivity.class);
            }
        });
        event.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(eventsActivity.class);
            }
        });
        battleGenerator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(battleGeneratorActivity.class);
            }
        });
    }

    private void toView(Class<?> classTarget) {
        startActivity(new Intent(this, classTarget));
    }
}
