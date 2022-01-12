package com.example.assignment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.assignment.AssignmentApiPackage.ApiClient;
import com.example.assignment.AssignmentApiPackage.ApiService;
import com.example.assignment.AssignmentApiPackage.SubmitAnswerRequest;
import com.example.assignment.AssignmentApiPackage.SubmitAnswerResponse;
import com.example.assignment.DuePackage.FragmentDue;
import com.example.assignment.PublishPackage.FragmentPublish;
import com.example.assignment.ReturnPackage.FragmentReturn;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private Button bottomSheet;
    private BottomSheetDialog bottomSheetDialog;
    private Toolbar customToolbar;
    RecyclerView recyclerViewDue;
    Retrofit retrofit;
    ApiService apiService;
    RecyclerView.LayoutManager DueCardLayoutManager;
    ArrayList<Subject> subjects = new ArrayList<>();
    RecyclerView recyclerViewSubject;
    RecyclerView.Adapter subjectAdapter = new SubjectAdapter(subjects);
    RecyclerView.LayoutManager SubjectCardLayoutManager;
    SubmitAnswerRequest submitAnswerRequest;
    SubmitAnswerResponse submitAnswerResponse;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        customToolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentPublish(), "Published(10)");
        adapter.AddFragment(new FragmentDue(), "Due(12)");
        adapter.AddFragment(new FragmentReturn(), "Returned(24)");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

         apiInit();
        //getAssignmentDashBoardResponse();
        // getTodaysActivityResponse();
        //getAssignmentStudentSubjectDetailsResponse();
        //getAssignmentTaskResponse();
        //getAssignmentStudentsAnswersResponse();
        //getAssignmentSummaryStudentResponse();
        //getAssignmentStudentAnswerResponse();
        //getCurriculumResponse();
        //getSubjectsResponse();
        //getChapterResponse();
        getSubmitAns();
    }
    public void apiInit() {

        retrofit = ApiClient.getRetrofit();
        apiService = ApiClient.getApiService();

    }
     public void getSubmitAns() {
        SubmitAnswerRequest submitAnswerRequest = new SubmitAnswerRequest(129,"Submitted");
        Call<SubmitAnswerResponse> call = apiService.getSubmitAnsCall(submitAnswerRequest);
        call.enqueue(new Callback<SubmitAnswerResponse>() {
            @Override
            public void onResponse(Call<SubmitAnswerResponse> call, Response<SubmitAnswerResponse> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
                }
                SubmitAnswerResponse submitAnswerResponse = response.body();
                Toast.makeText(getApplicationContext(), submitAnswerResponse.getShow().message, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<SubmitAnswerResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error submit :(", Toast.LENGTH_LONG).show();
            }
        });
    }

//    public void getTodaysActivityResponse() {
//
//        Call<AssignmentTodaysActivityResponse> todaysActivityResponseCall = apiService.getTodaysActivityResponse();
//        todaysActivityResponseCall.enqueue(new Callback<AssignmentTodaysActivityResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentTodaysActivityResponse> call, Response<AssignmentTodaysActivityResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//
//                AssignmentTodaysActivityResponse assignmentTodaysActivityResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentTodaysActivityResponse.getDueForSubmission().get(0).getStatus(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentTodaysActivityResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }



//   public void getAssignmentStudentSubjectDetailsResponse()
//   {
//        int subjectId = 3;
//        Call<AssignmentStudentSubjectDetailsResponse> studentSubjectDetailsResponseCall = apiService.getAssignmentStudentSubjectDetailsResponse(subjectId);
//        studentSubjectDetailsResponseCall.enqueue(new Callback<AssignmentStudentSubjectDetailsResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentStudentSubjectDetailsResponse> call, Response<AssignmentStudentSubjectDetailsResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentStudentSubjectDetailsResponse assignmentStudentSubjectDetailsResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentStudentSubjectDetailsResponse.getDrafts().get(0).getTitle(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentStudentSubjectDetailsResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//
//            }
//        });
//    }


//    public void getAssignmentTaskResponse() {
//        int subjectId = 52;
//        Call<AssignmentTaskResponse> assignmentTaskResponseCall = apiService.getAssignmentTaskResponse(subjectId);
//        assignmentTaskResponseCall.enqueue(new Callback<AssignmentTaskResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentTaskResponse> call, Response<AssignmentTaskResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentTaskResponse assignmentTaskResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentTaskResponse.getTasks().get(0).getType(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentTaskResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getAssignmentDashBoardResponse() {
//        Call<AssignmentDashboardResponse> assignmentDashboardResponseCall = apiService.getDashBoardResponse();
//        assignmentDashboardResponseCall.enqueue(new Callback<AssignmentDashboardResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentDashboardResponse> call, Response<AssignmentDashboardResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentDashboardResponse assignmentDashboardResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentDashboardResponse.getSubjects().get(0).subjectName, Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentDashboardResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getAssignmentStudentsAnswersResponse() {
//        int assignmentId = 23;
//        Call<AssignmentStudentsAnswersResponse> assignmentStudentsAnswersResponseCall = apiService.getAssignmentStudentsAnswersResponse(assignmentId);
//        assignmentStudentsAnswersResponseCall.enqueue(new Callback<AssignmentStudentsAnswersResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentStudentsAnswersResponse> call, Response<AssignmentStudentsAnswersResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentStudentsAnswersResponse assignmentStudentsAnswersResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentStudentsAnswersResponse.getTasks().get(0).getStatement(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentStudentsAnswersResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getAssignmentSummaryStudentResponse() {
//        String type = "week";
//        String startDate = "2021-11-21";
//        String endDate = "2021-11-27";
//        Call<List<AssignmentSummaryStudentResponse>> summaryStudentResponseCall = apiService.getAssignmentSummaryStudentResponse(type, startDate, endDate);
//        summaryStudentResponseCall.enqueue(new Callback<List<AssignmentSummaryStudentResponse>>() {
//            @Override
//            public void onResponse(Call<List<AssignmentSummaryStudentResponse>> call, Response<List<AssignmentSummaryStudentResponse>> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                List<AssignmentSummaryStudentResponse> assignmentSummaryStudentResponseList = response.body();
//                AssignmentSummaryStudentResponse assignmentSummaryStudentResponse = assignmentSummaryStudentResponseList.get(0);
//                Toast.makeText(getApplicationContext(), assignmentSummaryStudentResponse.getUnit(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<AssignmentSummaryStudentResponse>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getAssignmentStudentAnswerResponse() {
//        AssignmentStudentAnswerRequest assignmentStudentAnswerRequest = new AssignmentStudentAnswerRequest(135, "Objective", 1);
//        Call<AssignmentStudentAnswerResponse> assignmentStudentAnswerResponseCall = apiService.getAssignmentStudentAnswerResponse(assignmentStudentAnswerRequest);
//        assignmentStudentAnswerResponseCall.enqueue(new Callback<AssignmentStudentAnswerResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentStudentAnswerResponse> call, Response<AssignmentStudentAnswerResponse> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentStudentAnswerResponse assignmentStudentAnswerResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentStudentAnswerResponse.getShow().getMessage(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentStudentAnswerResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getCurriculumResponse() {
//        Call<List<StandardsGroupedByCurriculumResponse>> curriculumResponseCall = apiService.getCurriculumResponse();
//        curriculumResponseCall.enqueue(new Callback<List<StandardsGroupedByCurriculumResponse>>() {
//            @Override
//            public void onResponse(Call<List<StandardsGroupedByCurriculumResponse>> call, Response<List<StandardsGroupedByCurriculumResponse>> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                List<StandardsGroupedByCurriculumResponse> standardsGroupedByCurriculumResponseList = response.body();
//                StandardsGroupedByCurriculumResponse standardsGroupedByCurriculumResponse = standardsGroupedByCurriculumResponseList.get(0);
//                Toast.makeText(getApplicationContext(), standardsGroupedByCurriculumResponse.getName(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<StandardsGroupedByCurriculumResponse>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }

//    public void getSubjectsResponse() {
//        int curriculumId = 1;
//        int standardId = 1;
//        Call<List<Subjects>> subjectResponseCall = apiService.getSubjectResponse(curriculumId, standardId);
//        subjectResponseCall.enqueue(new Callback<List<Subjects>>() {
//            @Override
//            public void onResponse(Call<List<Subjects>> call, Response<List<Subjects>> response) {
//                if (!response.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                List<Subjects> subjectsList = response.body();
//                Subjects subjects = subjectsList.get(0);
//                Toast.makeText(getApplicationContext(), subjects.getSubName(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<Subjects>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }


//    public void getChapterResponse()
//    {
//        int standardId = 1;
//        int curriculumId = 1;
//        int subjectId = 1;
//        Call<AssignmentGetChapterResponse> assignmentGetChapterResponseCall = apiService.getChapterResponse(standardId,curriculumId,subjectId);
//        assignmentGetChapterResponseCall.enqueue(new Callback<AssignmentGetChapterResponse>() {
//            @Override
//            public void onResponse(Call<AssignmentGetChapterResponse> call, Response<AssignmentGetChapterResponse> response) {
//                if (!response.isSuccessful()){
//                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
//                }
//                AssignmentGetChapterResponse assignmentGetChapterResponse = response.body();
//                Toast.makeText(getApplicationContext(), assignmentGetChapterResponse.getChapters().get(0).getChapterName(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<AssignmentGetChapterResponse> call, Throwable t) {
//                Toast.makeText(getApplicationContext(), "Error :(", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);

    return true;
}

}