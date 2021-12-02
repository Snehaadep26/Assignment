package com.example.assignment.ReturnPackage;




import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import java.util.ArrayList;

public class ReturnAdapter extends RecyclerView.Adapter<ReturnAdapter.CardViewHolder> {

    ArrayList<Returned> returned;

    public ReturnAdapter(ArrayList<Returned> returned) {
        this.returned = returned;
    }
    @NonNull
    @Override
    public ReturnAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.return_card,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Returned currentCards = this.returned.get(position);
        holder.teacherName.setText(currentCards.getTeacherName());
        holder.subjectImage.setImageResource(currentCards.getImageView());

        holder.week.setText(currentCards.getWeek());
        holder.subject.setText(currentCards.getSubject());
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public  ImageView subjectImage;
        public TextView teacherName;
        public  TextView subject;
        public TextView week;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            subjectImage=itemView.findViewById(R.id.subjectImage);
            subject=itemView.findViewById(R.id.Mathematics);
            week=itemView.findViewById(R.id.WeekTwoAssignment_tv);
            teacherName = itemView.findViewById(R.id.Teacher_name_textView);


        }
    }
}


