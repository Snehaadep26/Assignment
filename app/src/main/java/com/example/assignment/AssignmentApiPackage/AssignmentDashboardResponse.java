package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class AssignmentDashboardResponse {
    public List<Subjects> subjects;
    public TodaysActivities todaysActivities;
    public List<Summary> summary;
    public int publishedCount;
    public int dueForSubmissionCount;
    public int returnedCount;
    public List<AllSubject> allSubjects;

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    public TodaysActivities getTodaysActivities() {
        return todaysActivities;
    }

    public void setTodaysActivities(TodaysActivities todaysActivities) {
        this.todaysActivities = todaysActivities;
    }

    public List<Summary> getSummary() {
        return summary;
    }

    public void setSummary(List<Summary> summary) {
        this.summary = summary;
    }

    public int getPublishedCount() {
        return publishedCount;
    }

    public void setPublishedCount(int publishedCount) {
        this.publishedCount = publishedCount;
    }

    public int getDueForSubmissionCount() {
        return dueForSubmissionCount;
    }

    public void setDueForSubmissionCount(int dueForSubmissionCount) {
        this.dueForSubmissionCount = dueForSubmissionCount;
    }

    public int getReturnedCount() {
        return returnedCount;
    }

    public void setReturnedCount(int returnedCount) {
        this.returnedCount = returnedCount;
    }

    public List<AllSubject> getAllSubjects() {
        return allSubjects;
    }

    public void setAllSubjects(List<AllSubject> allSubjects) {
        this.allSubjects = allSubjects;
    }
}


