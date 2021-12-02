package com.example.assignment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    ArrayList<Cards> card;

    public CardAdapter(ArrayList<Cards> card) {
        this.card = card;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Cards currentCards = this.card.get(position);


        holder.teacherName.setText(currentCards.getTeacherName());


    }

    @Override
    public int getItemCount() {
        return card.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {


        public TextView teacherName;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);


            teacherName = itemView.findViewById(R.id.Teacher_name_textView);

        }
    }
}
