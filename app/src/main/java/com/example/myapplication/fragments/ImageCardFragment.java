package com.example.myapplication.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.entities.Deployment;
import com.example.myapplication.entities.ImgCard;
import com.example.myapplication.services.ResIdentifier;

import java.util.ArrayList;

public class ImageCardFragment extends Fragment {
    TextView title;
    ImageView imageView;
    ImageView equlibrated;
    ImgCard card;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_card, container, false);
        Bundle extras = getArguments();
        ArrayList<?> mapsDeck = extras.getParcelableArrayList("mapsDeck");
        SharedPreferences prefs = getContext().getSharedPreferences("PREFS", Context.MODE_PRIVATE);
        int index = prefs.getInt("index", 0);
        title = view.findViewById(R.id.CardViewTittle);
        title.setVisibility(View.GONE);
        imageView = view.findViewById(R.id.CardViewImage);
        equlibrated = view.findViewById(R.id.CardViewEquilibrated);
        equlibrated.setVisibility(View.INVISIBLE);
        card = (ImgCard) mapsDeck.get(index);

        if (card.getClass().equals(Deployment.class)) {
            title.setVisibility(View.VISIBLE);
            title.setText(card.getTitle());
        }
        imageView.setImageResource(ResIdentifier.getResId(card.getImg(), R.drawable.class));

        if (card.isEquilibrated()) {
            equlibrated.setVisibility(View.VISIBLE);
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    public static ImageCardFragment newInstance(int index) {
        ImageCardFragment imageCardFragment = new ImageCardFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        imageCardFragment.setArguments(args);
        return imageCardFragment;
    }


}
