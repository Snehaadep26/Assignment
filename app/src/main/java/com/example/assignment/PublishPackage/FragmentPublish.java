package com.example.assignment.PublishPackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;
import com.example.assignment.ViewPagerAdapter;

import java.util.ArrayList;

public class FragmentPublish extends Fragment {
        View v;
        ArrayList<Published> published;
        RecyclerView recView1;
        RecyclerView.LayoutManager layoutManager1;
        PublishAdapter adapter1;

        public FragmentPublish()
        {

        }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.publish_fragment,container,false);
        recView1=(RecyclerView)v.findViewById(R.id.week2_recyclerView);
        recView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recView1.setLayoutManager(layoutManager1);
        adapter1 = new PublishAdapter(published);
        recView1.setAdapter(adapter1);
        return v;

    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

            published = new ArrayList<>();

            published.add(new Published("teacher's name"));
            published.add(new Published("Kenneth P.Held"));
            published.add(new Published("teacher's name"));
            published.add(new Published("Kenneth P.Held"));
            published.add(new Published("teacher's name"));

        }

}