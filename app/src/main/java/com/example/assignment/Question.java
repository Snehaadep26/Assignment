package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Question extends AppCompatActivity {

    ArrayList<com.example.assignment.AllQuestions> que=new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    private AlertDialog.Builder alertDialogBuilder;
    private AlertDialog alertDialog;
    public Button bottomSheet,bottomSheet2;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        createCard();
        buildRecyclerView();

        bottomSheet = (Button) findViewById(R.id.buttonsubmit);
        bottomSheet2 = (Button) findViewById(R.id.buttonsub);
        bottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1();
            }
        });
        bottomSheet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2();
            }
        });


    }

    private void view1() {

        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView1 = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
        popupView1.setClipToOutline(true);
        alertDialogBuilder.setView(popupView1);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), bottomSheet.getText() + "Clicked", Toast.LENGTH_LONG).show();
    }


    private void view2() {

        alertDialogBuilder = new AlertDialog.Builder(this);
        final View popupView2 = getLayoutInflater().inflate(R.layout.submit_sheet, null);
        popupView2.setClipToOutline(true);
        alertDialogBuilder.setView(popupView2);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        Toast.makeText(getApplicationContext(), bottomSheet2.getText() + "Clicked", Toast.LENGTH_LONG).show();
    }


    public  void  createCard(){
        que=new ArrayList<>();
        que.add(new AllQuestions("Question 1","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","","Attempted"));
        que.add(new AllQuestions("Question 2","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","","UnAttempted"));
        que.add(new AllQuestions("Question 3","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","","Attempted"));
        que.add(new AllQuestions("Question 4","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","","Attempted"));
        que.add(new AllQuestions("Question 5","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","",""));
//        que.add(new AllQuestions("Question 6","The species that contains 24 protons, 26 neutrons and 22 electrons would be represented by the symbol:","",""));

    }

    public void buildRecyclerView() {
        recyclerView=findViewById(R.id.weekrecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AllQuestionsAdapter(que);
        recyclerView.setAdapter(adapter);
    }

}