package com.example.myapplication.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.entities.Card;
import com.example.myapplication.entities.Quest;

import java.util.List;

class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<Card> questDeck;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;


    public MyRecyclerViewAdapter(Context context, List<Card> questDeck) {
        this.mInflater = LayoutInflater.from(context);
        this.questDeck = questDeck;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Quest quest = (Quest) questDeck.get(position);
        holder.titleQuest.setText(quest.getTitle());
        holder.descriptionQuest.setText(quest.getDescription());
        holder.equlibratedQuest.setText(quest.isEquilibrated().toString());
    }


    @Override
    public int getItemCount() {
        return questDeck.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView titleQuest;
        TextView descriptionQuest;
        TextView equlibratedQuest;

        ViewHolder(View itemView) {
            super(itemView);
            titleQuest = itemView.findViewById(R.id.quest_title);
            descriptionQuest = itemView.findViewById(R.id.quest_description);
            equlibratedQuest = itemView.findViewById(R.id.is_equilibrated);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());

        }
    }

    // convenience method for getting data at click position
    Card getItem(int id) {
        return questDeck.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}