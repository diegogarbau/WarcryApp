package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class mainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView maps = this.findViewById(R.id.maps_button);
//        ImageView bands = this.findViewById(R.id.band_select_button);
        ImageView quest = this.findViewById(R.id.quest_button);
        ImageView deployment = this.findViewById(R.id.deployment_button);
        ImageView event = this.findViewById(R.id.events_button);
        ImageView battleGenerator = this.findViewById(R.id.battleplan_generator_button);

        maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toView(MapsActivity.class);
            }
        });
//        bands.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                toView(bandsActivity.class);
//            }
//        });
        quest.setOnClickListener(v -> toView(questsActivity.class));
        deployment.setOnClickListener(v -> toView(deploymentActivity.class));
        event.setOnClickListener(v -> toView(eventsActivity.class));
        battleGenerator.setOnClickListener(v -> toView(battleGeneratorActivity.class));
    }

    private void toView(Class<?> classTarget) {
        startActivity(new Intent(this, classTarget));
    }
}
