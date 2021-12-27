package com.example.assignment.AssignmentApiPackage;

public class Summary {
    public int overdue;
    public String unit;
    public String date;
    public int submitted;
    public int dueForSubmission;

    public int getOverdue() {
        return overdue;
    }

    public void setOverdue(int overdue) {
        this.overdue = overdue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSubmitted() {
        return submitted;
    }

    public void setSubmitted(int submitted) {
        this.submitted = submitted;
    }

    public int getDueForSubmission() {
        return dueForSubmission;
    }

    public void setDueForSubmission(int dueForSubmission) {
        this.dueForSubmission = dueForSubmission;
    }
}
