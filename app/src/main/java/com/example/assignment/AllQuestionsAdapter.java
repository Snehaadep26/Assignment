package com.example.assignment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllQuestionsAdapter extends RecyclerView.Adapter<AllQuestionsAdapter.CardViewHolder> {

        ArrayList<com.example.assignment.AllQuestions> card;

        public AllQuestionsAdapter(ArrayList<com.example.assignment.AllQuestions> card) {
            this.card = card;
        }

        @NonNull
        @Override
        public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_card,parent,false);
            CardViewHolder cvh = new CardViewHolder(view);
            return cvh;

        }

        @Override
        public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
            com.example.assignment.AllQuestions currentCards = this.card.get(position);


           // holder.teacherName.setText(currentCards.getTeacherName());
            holder.questionNo.setText(currentCards.getQuestionNumber());
            holder.question.setText(currentCards.getQuestion());
            holder.color.setTextColor(Color.parseColor("#FF6200EE"));
            holder.attempt.setText(currentCards.getAttempt());


        }

        @Override
        public int getItemCount() {
            return card.size();
        }

        public class CardViewHolder extends RecyclerView.ViewHolder {


            public TextView questionNo,question,color,attempt;




            public CardViewHolder(@NonNull View itemView) {
                super(itemView);


                //teacherName = itemView.findViewById(R.id.Teacher_name_textView);
                questionNo=itemView.findViewById(R.id.questionnoText);
                question=itemView.findViewById(R.id.questionText);
                color=itemView.findViewById(R.id.colorText);
                attempt=itemView.findViewById(R.id.attemptText);

            }
        }
    }