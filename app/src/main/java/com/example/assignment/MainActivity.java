package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toolbar;

import com.example.assignment.DuePackage.FragmentDue;
import com.example.assignment.PublishPackage.PublishAdapter;
import com.example.assignment.PublishPackage.FragmentPublish;
import com.example.assignment.ReturnPackage.FragmentReturn;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    private Button bottomSheet;
    private BottomSheetDialog bottomSheetDialog;

    RecyclerView recyclerViewDue;
    RecyclerView.LayoutManager DueCardLayoutManager;
    ArrayList<Subject> subjects = new ArrayList<>();
    RecyclerView recyclerViewSubject;
    RecyclerView.Adapter subjectAdapter = new SubjectAdapter(subjects);
    RecyclerView.LayoutManager SubjectCardLayoutManager;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new FragmentPublish(), "Published(10)");
        adapter.AddFragment(new FragmentDue(), "Due(12)");
        adapter.AddFragment(new FragmentReturn(), "Returned(24)");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



        bottomSheet = findViewById(R.id.botom_start);
        bottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetTheme);
                View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet, null);

                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }

        });


    }



}

