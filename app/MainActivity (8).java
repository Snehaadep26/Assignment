package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cards> card= new ArrayList<>();
    RecyclerView recyclerView;

    RecyclerView.Adapter cardAdapter;
    RecyclerView.LayoutManager cardLayoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        buildReecyclerViewForCards();

        }
    public  void  createCard(){
        card=new ArrayList<>();
        card.add(new Cards("teacher's name"));
        card.add(new Cards("Kenneth P.Held"));
        card.add(new Cards("teacher's name"));
        card.add(new Cards("Kenneth P.Held"));


    }
    public  void buildReecyclerViewForCards(){
        recyclerView=findViewById(R.id.week2_recyclerView);
        recyclerView.setHasFixedSize(true);
        cardLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(cardLayoutManager);
        cardAdapter=new CardAdapter(card);
        recyclerView.setAdapter(cardAdapter);

    }
}