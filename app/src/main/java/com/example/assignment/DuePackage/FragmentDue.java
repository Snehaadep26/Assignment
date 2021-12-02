package com.example.assignment.DuePackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.MainActivity;
import com.example.assignment.PublishPackage.PublishAdapter;
import com.example.assignment.PublishPackage.Published;
import com.example.assignment.R;
import com.example.assignment.Subject;
import com.example.assignment.SubjectAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class FragmentDue extends Fragment {

        private Button bottomSheet;
        private BottomSheetDialog bottomSheetDialog;
        View v;


        ArrayList<Due> due = new ArrayList<>();
        RecyclerView recyclerViewDue;

        RecyclerView.Adapter dueAdapter = new DueAdapter(due);
        RecyclerView.LayoutManager DueCardLayoutManager;

        ArrayList<Subject> subjects = new ArrayList<>();
        RecyclerView recyclerViewSubjet;
        RecyclerView.Adapter subjectAdapter = new SubjectAdapter(subjects);
        RecyclerView.LayoutManager SubjectCardLayoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v=inflater.inflate(R.layout.publish_fragment,container,false);
        recyclerViewDue=(RecyclerView)v.findViewById(R.id.week2_recyclerView);
        recyclerViewDue.setHasFixedSize(true);
        DueCardLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewDue.setLayoutManager(DueCardLayoutManager);
        dueAdapter = new DueAdapter(due);
        recyclerViewDue.setAdapter(dueAdapter);
        return v;

    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        due = new ArrayList<>();
        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));


    }

}