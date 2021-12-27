package com.example.assignment.AssignmentApiPackage;

import java.util.List;

public class AssignmentStudentSubjectDetailsResponse {
    public List<Draft> drafts;
    public List<Submit> submitted;
    public List<Overdue> overdue;
    public List<Return> returned;
    public int draftCount;
    public int submittedCount;
    public int overdueCount;
    public int returnedCount;

    public List<Draft> getDrafts() {
        return drafts;
    }

    public void setDrafts(List<Draft> drafts) {
        this.drafts = drafts;
    }

    public List<Submit> getSubmitted() {
        return submitted;
    }

    public void setSubmitted(List<Submit> submitted) {
        this.submitted = submitted;
    }

    public List<Overdue> getOverdue() {
        return overdue;
    }

    public void setOverdue(List<Overdue> overdue) {
        this.overdue = overdue;
    }

    public List<Return> getReturned() {
        return returned;
    }

    public void setReturned(List<Return> returned) {
        this.returned = returned;
    }

    public int getDraftCount() {
        return draftCount;
    }

    public void setDraftCount(int draftCount) {
        this.draftCount = draftCount;
    }

    public int getSubmittedCount() {
        return submittedCount;
    }

    public void setSubmittedCount(int submittedCount) {
        this.submittedCount = submittedCount;
    }

    public int getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(int overdueCount) {
        this.overdueCount = overdueCount;
    }

    public int getReturnedCount() {
        return returnedCount;
    }

    public void setReturnedCount(int returnedCount) {
        this.returnedCount = returnedCount;
    }
}


