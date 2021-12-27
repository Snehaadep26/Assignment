package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class TodaysActivities {
    public List<Published> published;
    public List<DueForSubmission> dueForSubmission;
    public List<Object> returned;
    public List<AllSubject> allSubjects;

    public List<Published> getPublished() {
        return published;
    }

    public void setPublished(List<Published> published) {
        this.published = published;
    }

    public List<DueForSubmission> getDueForSubmission() {
        return dueForSubmission;
    }

    public void setDueForSubmission(List<DueForSubmission> dueForSubmission) {
        this.dueForSubmission = dueForSubmission;
    }

    public List<Object> getReturned() {
        return returned;
    }

    public void setReturned(List<Object> returned) {
        this.returned = returned;
    }

    public List<AllSubject> getAllSubjects() {
        return allSubjects;
    }

    public void setAllSubjects(List<AllSubject> allSubjects) {
        this.allSubjects = allSubjects;
    }
}
