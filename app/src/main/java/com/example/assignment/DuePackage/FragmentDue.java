package com.example.assignment.DuePackage;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.AssignmentApiPackage.ApiClient;
import com.example.assignment.AssignmentApiPackage.ApiService;
import com.example.assignment.AssignmentApiPackage.AssignmentTodaysActivityResponse;
import com.example.assignment.AssignmentApiPackage.DueForSubmission;
import com.example.assignment.R;
import com.example.assignment.Subject;
import com.example.assignment.SubjectAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FragmentDue extends Fragment {
int progress;
    View myView;
    Retrofit retrofit;
    ApiService apiService;
    ProgressBar progressBar;
    String perText;
    private AlertDialog.Builder alertDialogBuilder;
    private AlertDialog alertDialog;
    ArrayList<Due> due = new ArrayList<>();
    RecyclerView recyclerViewDue;
    Button button;
    RecyclerView.Adapter dueAdapter = new DueAdapter(due, getContext());
    RecyclerView.LayoutManager DueCardLayoutManager;
    ArrayList<Subject> subjects = new ArrayList<>();

    RecyclerView recyclerViewSubjet;
    RecyclerView.Adapter subjectAdapter = new SubjectAdapter(subjects);
    RecyclerView.LayoutManager SubjectCardLayoutManager;

        @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        myView=inflater.inflate(R.layout.publish_fragment,container,false);
        recyclerViewDue=(RecyclerView)myView.findViewById(R.id.week2_recyclerView);
        progressBar=(ProgressBar)myView.findViewById(R.id.bar);
        due = new ArrayList<>();
        apiInit();
        getTodaysActivityResponse();
//        button=myView.findViewById(R.id.submitButton);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_LONG).show();
//            }
//        });


        return myView;

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
                        Toast.makeText(getContext(), String.valueOf(response.code()), Toast.LENGTH_LONG).show();
                    }

                    AssignmentTodaysActivityResponse assignmentTodaysActivityResponse = response.body();
                    ArrayList<DueForSubmission> dueForSubmissions= (ArrayList<DueForSubmission>) assignmentTodaysActivityResponse.getDueForSubmission();
                    for(DueForSubmission d
                    :dueForSubmissions){
                        String que=d.getNoOfQuestions();
                        Log.i("que",que);
                        String count=d.getCountAttempted();
                        Log.i("count",count);
                        Double mark=Double.parseDouble(que);
                        Double cnt=Double.parseDouble(count);
                        int q=mark.intValue();
                        int p=cnt.intValue();
                        progress=((p/q)*100)+45;
                        Log.i("progress",String.valueOf(progress));
                        perText=(String.valueOf(progress));
                        due.add(new Due(d.getSubjectIcon(),d.getNoOfQuestions(),d.getMarks(),d.subjectName,d.type,d.title,progress,perText+"%"));

                    }

                    DueCardLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
                    recyclerViewDue.setLayoutManager(DueCardLayoutManager);
                    dueAdapter = new DueAdapter(due,getContext());
                    recyclerViewDue.setAdapter(dueAdapter);


                }

                @Override
                public void onFailure(Call<AssignmentTodaysActivityResponse> call, Throwable t) {
                    Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
                }
            });
        }
    }


}



//        due = new ArrayList<>();
//        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));
//        due.add(new Due(R.drawable.sbjmathematics, "Week 2 Assignment", "Mathematics", "Kenneth P"));


      

