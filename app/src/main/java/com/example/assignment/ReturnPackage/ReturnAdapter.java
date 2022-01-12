package com.example.assignment.ReturnPackage;




import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.Question;
import com.example.assignment.R;
import com.example.assignment.Utils;

import java.util.ArrayList;

public class ReturnAdapter extends RecyclerView.Adapter<ReturnAdapter.CardViewHolder> {

    ArrayList<Returned> returned;
    Context context;
    private static final String baseUrlForImages = "https://s3.ap-south-1.amazonaws.com/test.files.classroom.digital/";

    public ReturnAdapter(ArrayList<Returned> returned, Context context) {
        this.returned = returned;
        this.context=context;
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
        holder.subject.setText(currentCards.getSubject());
        Utils.fetchSvg(context,baseUrlForImages+currentCards.getSubjectImage(), holder.subjectImage);
        holder.noOfQuestion.setText(currentCards.getNoOfQuestions());
        holder.marks.setText(currentCards.getMarks());
        holder.type.setText(currentCards.getType());
        holder.title.setText(currentCards.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Question.class);
                context.startActivity(intent);


                Toast.makeText(context, "Dues", Toast.LENGTH_SHORT).show();

//
            }
        });
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public  ImageView subjectImage;

        public  TextView subject,noOfQuestion,marks,type,title;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            subject=itemView.findViewById(R.id.Mathematics);
            subjectImage=itemView.findViewById(R.id.subjectImage);
            noOfQuestion=itemView.findViewById(R.id.seven72_textView);
            marks=itemView.findViewById(R.id.hundread_tv);
            type=itemView.findViewById(R.id.objective_textView);
            title=itemView.findViewById(R.id.WeekTwoAssignment_tv);

        }
    }
}


