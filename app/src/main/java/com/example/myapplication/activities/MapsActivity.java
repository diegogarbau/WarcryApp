package com.example.myapplication.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.fragments.ImageCardFragment;
import com.example.myapplication.services.MapService;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends AppCompatActivity {

    MapService service = new MapService();
    List<?> mapsDeck = new ArrayList<>();
    final int INIT = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        mapsDeck = service.getData(getResources().openRawResource(R.raw.mapsfile));
        SharedPreferences.Editor editor = getSharedPreferences("PREFS", MODE_PRIVATE).edit();
        editor.putInt("index", INIT);
        editor.apply();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("mapsDeck", (ArrayList<? extends Parcelable>) mapsDeck);
        Fragment fragment = new ImageCardFragment();
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}