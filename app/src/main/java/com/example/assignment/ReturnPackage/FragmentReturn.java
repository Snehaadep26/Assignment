package com.example.assignment.ReturnPackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import java.util.ArrayList;

public class FragmentReturn extends Fragment {

    View v;

    ArrayList<Returned> returned = new ArrayList<>();
    RecyclerView recyclerViewReturned;

    RecyclerView.Adapter returnAdapter = new ReturnAdapter(returned);
    RecyclerView.LayoutManager ReturnCardLayoutManager;

    public FragmentReturn()
    {

    }

    @Nullable



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.return_fragment,container,false);
        recyclerViewReturned =(RecyclerView)v. findViewById(R.id.week2_recyclerView);
        recyclerViewReturned.setHasFixedSize(true);
        ReturnCardLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewReturned.setLayoutManager(ReturnCardLayoutManager);
        returnAdapter = new ReturnAdapter(returned);
        recyclerViewReturned.setAdapter(returnAdapter);
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        returned = new ArrayList<>();
        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));

    }

}
