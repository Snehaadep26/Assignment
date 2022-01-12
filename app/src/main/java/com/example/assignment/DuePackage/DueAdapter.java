package com.example.assignment.DuePackage;



import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assignment.Question;
import com.example.assignment.R;
import com.example.assignment.Utils;

import java.util.ArrayList;

public class DueAdapter extends RecyclerView.Adapter<DueAdapter.CardViewHolder> {

    ArrayList<Due> dues;
    Context context;
    private static final String baseUrlForImages = "https://s3.ap-south-1.amazonaws.com/test.files.classroom.digital/";


    public DueAdapter(ArrayList<Due> dues,Context context) {
        this.dues = dues;
        this.context=context;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.due_card,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Due currentCards = this.dues.get(position);
        Utils.fetchSvg(context,baseUrlForImages+currentCards.getSubjectImage(), holder.subjectImage);
        holder.subject.setText(currentCards.getSubject());
        holder.noOfQuestions.setText(currentCards.getNoOfQuestions());
        holder.marks.setText(currentCards.getMarks());
        holder.type.setText(currentCards.getType());
        holder.title.setText(currentCards.getTitle());
        holder.bar.setProgress(currentCards.getProgress());
        holder.perText.setText(currentCards.getPerText());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder;
                AlertDialog alertDialog;
                alertDialogBuilder = new AlertDialog.Builder(context);
                View view1=View.inflate(context,R.layout.submit_sheet,null);
                view1.setClipToOutline(true);
                alertDialogBuilder.setView(view1);
                alertDialog = alertDialogBuilder.create();

                alertDialog.show();
            }
        });



    }

    @Override
    public int getItemCount() {
        return dues.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public  ImageView subjectImage;
       public  TextView subject,noOfQuestions,marks,type,title;
       Button button,yes;
       ProgressBar bar;
       TextView perText;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectImage=itemView.findViewById(R.id.subjectImage);
            subject=itemView.findViewById(R.id.Mathematics);
            noOfQuestions=itemView.findViewById(R.id.seven72_textView);
            marks=itemView.findViewById(R.id.hundread_tv);
            type=itemView.findViewById(R.id.objective_textView);
            title=itemView.findViewById(R.id.WeekTwoAssignment_tv);
            button=itemView.findViewById(R.id.submitButton);
            //yes=itemView.findViewById(R.id.yesButton);
            bar=itemView.findViewById(R.id.bar);
            perText=itemView.findViewById(R.id.percentText);

        }
    }
}
