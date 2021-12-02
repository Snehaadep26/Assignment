package com.example.assignment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.CardViewHolder> {
    ArrayList<Subject> subjects;

    public SubjectAdapter(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }



    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottom_sheet, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Subject currentCards = this.subjects.get(position);

        holder.tickImage.setImageResource(currentCards.getTickImage());
        holder.subjectNames.setText(currentCards.getSubjecttxtview());


    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public ImageView tickImage;
        public TextView subjectNames;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            tickImage = itemView.findViewById(R.id.select);
            subjectNames = itemView.findViewById(R.id.english);

        }
    }
}

