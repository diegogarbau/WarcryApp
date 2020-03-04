package com.example.myapplication.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class questsActivity extends AppCompatActivity {
    TextView questViewDescription;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);
        initializeView();
        questViewDescription.setOnTouchListener(new OnSwipeTouchListener(questsActivity.this) {
            public void onSwipeRight() {
                
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastRight), Toast.LENGTH_SHORT).show();
            }

            public void onSwipeLeft() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastLeft), Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void initializeView() {
        questViewDescription = (TextView) findViewById(R.id.CardViewDescription);
    }
}


