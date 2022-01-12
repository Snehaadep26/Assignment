package com.example.assignment.ReturnPackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.AssignmentApiPackage.ApiClient;
import com.example.assignment.AssignmentApiPackage.ApiService;
import com.example.assignment.AssignmentApiPackage.AssignmentTodaysActivityResponse;
import com.example.assignment.AssignmentApiPackage.DueForSubmission;
import com.example.assignment.AssignmentApiPackage.Return;
import com.example.assignment.DuePackage.Due;
import com.example.assignment.DuePackage.DueAdapter;
import com.example.assignment.Question;
import com.example.assignment.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FragmentReturn extends Fragment {

    View v;
    int summarySize;
    ArrayList<Returned> returns = new ArrayList<>();
    RecyclerView recyclerViewReturned;
    Retrofit retrofit;
    ApiService apiService;
    TextView textView;


    RecyclerView.Adapter returnAdapter = new ReturnAdapter(returns, getContext());
    RecyclerView.LayoutManager ReturnCardLayoutManager;

    public FragmentReturn() {

    }

    @Nullable


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.return_fragment, container, false);
        recyclerViewReturned = (RecyclerView) v.findViewById(R.id.week2_recyclerView);
        returns = new ArrayList<>();
//        textView=v.findViewById(R.id.WeekTwoAssignment_tv);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(getContext(), Question.class);
//            }
//        });
        apiInit();
        getTodaysActivityResponse();

        return v;
    }

    public void apiInit() {

        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();
    }

    private void getTodaysActivityResponse() {
        {

            Call<AssignmentTodaysActivityResponse> todaysActivityResponseCall = apiService.getTodaysActivityResponse();
            todaysActivityResponseCall.enqueue(new Callback<AssignmentTodaysActivityResponse>() {
                @Override
                public void onResponse(Call<AssignmentTodaysActivityResponse> call, Response<AssignmentTodaysActivityResponse> response) {
                    if (!response.isSuccessful()) {
                        Toast.makeText(getContext(), response.code(), Toast.LENGTH_LONG).show();
                    }

                    AssignmentTodaysActivityResponse assignmentTodaysActivityResponse = response.body();
                    ArrayList<Return> returned = (ArrayList<Return>) assignmentTodaysActivityResponse.getReturned();
                    for (Return r
                            : returned) {
                        //Log.i("Subject name", r.subjectName);
                        returns.add(new Returned(r.subjectName, r.subjectIcon, r.noOfQuestions, r.marks, r.type, r.title));

                    }
                    ReturnCardLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                    recyclerViewReturned.setLayoutManager(ReturnCardLayoutManager);
                    returnAdapter = new ReturnAdapter(returns, getContext());
                    recyclerViewReturned.setAdapter(returnAdapter);

                }

                @Override
                public void onFailure(Call<AssignmentTodaysActivityResponse> call, Throwable t) {
                    Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        returned = new ArrayList<>();
//        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        returned.add(new Returned(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//
//    }


