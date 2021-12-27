package com.example.assignment.AssignmentApiPackage;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/standard-dashboard")
    Call<AssignmentDashboardResponse> getDashBoardResponse();

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/todays-activities")
    Call<AssignmentTodaysActivityResponse> getTodaysActivityResponse();

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/student/subject-details/")
    Call<AssignmentStudentSubjectDetailsResponse> getAssignmentStudentSubjectDetailsResponse(@Query("subjectId") int subjectId);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/student/answers")
    Call<AssignmentTaskResponse> getAssignmentTaskResponse(@Query("assignmentId") int assignmentId);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/student/answers")
    Call<AssignmentStudentsAnswersResponse> getAssignmentStudentsAnswersResponse(@Query("assignmentId") int assignmentId);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @GET("assignmentv2/student/summary")
    Call<List<AssignmentSummaryStudentResponse>> getAssignmentSummaryStudentResponse(@Query("type") String type, @Query("startDate") String startDate, @Query("endDate") String endDate);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDY1LCJwaG9uZSI6IjkwMzY0NTc2NjQiLCJ1cmwiOiJicmlnb3NoYS5jbGFzc3Jvb20uZGlnaXRhbCIsIm9yZ0lkIjoiZjg2MDg0OTctZmIzNC00YWJkLWE4YWQtM2ZiN2VkNzNmNTFkIiwiYnJvd3NlckxvZ2luQ29kZSI6IjkwMzY0NTc2NjQ0NjUwMDczYTdjZi04NGZlLTRhZGItOGMzYS0yNDc1YTkzOTgwYWMiLCJkZXZpY2VMb2dpbkNvZGUiOm51bGwsImlhdCI6MTY0MDI1MzY1M30.t3d9Aycjwi-HWKKtzi7VCd8F6HhnUdzbZo_wo0_dwho",
            "orgurl:test.theclassroom.biz"})
    @POST("assignmentv2/student/answer")
    Call<AssignmentStudentAnswerResponse> getAssignmentStudentAnswerResponse(@Body AssignmentStudentAnswerRequest assignmentStudentAnswerRequest);

    @GET("question-bank")
    Call<List<StandardsGroupedByCurriculumResponse>> getCurriculumResponse();

    @GET("question-bank/subjects")
    Call<List<Subjects>> getSubjectResponse(@Query("curriculumId") int curriculumId, @Query("standardId") int standardId);

    @GET("question-bank/chapters")
    Call<AssignmentGetChapterResponse> getChapterResponse(@Query("standardId") int standardId, @Query("curriculumId") int curriculumId, @Query("subjectId") int subjectId);
}
