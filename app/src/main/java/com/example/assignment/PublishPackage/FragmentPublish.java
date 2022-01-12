package com.example.assignment.PublishPackage;




import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.AssignmentApiPackage.ApiClient;
import com.example.assignment.AssignmentApiPackage.ApiService;
import com.example.assignment.AssignmentApiPackage.AssignmentTodaysActivityResponse;
import com.example.assignment.R;

import java.util.ArrayList;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

    public class FragmentPublish extends Fragment {
        View v;
        LayoutInflater inflater;
        ArrayList<Published> published;
        RecyclerView recView1;
        RecyclerView.LayoutManager layoutManager1;
        PublishAdapter adapter1;

        Retrofit retrofit;
        ApiService apiService;

        public FragmentPublish() {

        }


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            return inflater.inflate(R.layout.publish_fragment, container, false);
        }


        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);


            recView1 = view.findViewById(R.id.week2_recyclerView);
            layoutManager1 = new LinearLayoutManager(getContext());
            published = new ArrayList<>();
            apiInit();
            getTodaysActivityResponse();
        }

        public void apiInit() {

            retrofit = ApiClient.getRetrofit();
            apiService = ApiClient.getApiService();

        }

        public void getTodaysActivityResponse() {

            Call<AssignmentTodaysActivityResponse> todaysActivityResponseCall = apiService.getTodaysActivityResponse();
            todaysActivityResponseCall.enqueue(new Callback<AssignmentTodaysActivityResponse>() {
                @Override
                public void onResponse(Call<AssignmentTodaysActivityResponse> call, Response<AssignmentTodaysActivityResponse> response) {
                    if (!response.isSuccessful()) {
                        Toast.makeText(getContext(), String.valueOf(response.code()), Toast.LENGTH_LONG).show();
                    }

                    AssignmentTodaysActivityResponse assignmentTodaysActivityResponse = response.body();
                    ArrayList<com.example.assignment.AssignmentApiPackage.Published> publishedArrayList = (ArrayList<com.example.assignment.AssignmentApiPackage.Published>) assignmentTodaysActivityResponse.getPublished();
                    String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    for (com.example.assignment.AssignmentApiPackage.Published p :
                            publishedArrayList) {
                        Date date = p.getDueDate();
//                        Log.i("Title", p.getTitle());
//                        Log.i("Due Date",String.valueOf(date.getDate()));
//                        Log.i("Due Month",months[date.getMonth()]);
//                        Log.i("Subject", p.getSubjectName());
//                        Log.i("Type", p.getType());
//                        Log.i("No of Questions", p.getNoOfQuestions());
//                        Log.i("Marks", p.getMarks());
                        published.add(new Published(p.getTitle(),months[date.getMonth()],date.getDate(), p.getSubjectName(), p.getNoOfQuestions(), p.getMarks(), p.getType()));
                    }
                    recView1.setLayoutManager(layoutManager1);
                    recView1.setHasFixedSize(true);
                    adapter1 = new PublishAdapter(published);
                    recView1.setAdapter(adapter1);

                }

                @Override
                public void onFailure(Call<AssignmentTodaysActivityResponse> call, Throwable t) {
                    Toast.makeText(getContext(), "Error :(", Toast.LENGTH_LONG).show();
                }
            });
        }

    }

